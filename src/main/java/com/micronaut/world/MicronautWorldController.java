package com.micronaut.world;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.TaskScheduler;
import io.micronaut.scheduling.annotation.Scheduled;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;


@Controller("/message")
public class MicronautWorldController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello Micronaut";
    }

    @Scheduled(cron = "* * * * * *")
    void printStatement() {
        System.out.println("Myself vergheese, do you believe in Bug? Asked at: " + new Date());
    }
}
