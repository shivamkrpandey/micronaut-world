package com.micronaut.world;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

@Client("/message")
public interface HelloClient {
    @Get
    Single<String> hello();
}
