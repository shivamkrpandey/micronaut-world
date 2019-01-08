package com.micronaut.world

import io.micronaut.discovery.event.ServiceStartedEvent
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus
import io.micronaut.runtime.event.annotation.EventListener


@Controller("/eventListener")
class EventListenerController {

    @Get("/")
    HttpStatus index() {
        return HttpStatus.OK
    }

    @EventListener
    void onStartup(ServiceStartedEvent serviceStartedEvent) {
        System.out.println("Echo on startup")
    }
}