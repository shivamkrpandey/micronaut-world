package com.micronaut.world;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;


@Controller("/message")
public class MicronautWorldController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello Micronaut";
    }
}
