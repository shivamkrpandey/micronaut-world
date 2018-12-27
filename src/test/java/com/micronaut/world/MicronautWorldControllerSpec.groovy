package com.micronaut.world

import io.micronaut.context.ApplicationContext
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class MicronautWorldControllerSpec extends Specification {

    @Shared @AutoCleanup EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)
    @Shared @AutoCleanup HttpClient httpClient = HttpClient.create(embeddedServer.URL)
    void "test index to respond the hello world message"() {
        expect:
        httpClient.toBlocking().retrieve(HttpRequest.GET('/message')) == 'Hello Micronaut'
    }
}
