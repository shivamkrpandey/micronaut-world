package com.micronaut.world

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus


@Controller("/micronautWorld")
class MicronautWorldController {

    @Get("/")
    HttpStatus index() {
        return HttpStatus.OK
    }
}
