package com.malamute.dublin.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ExerciseRecordController {

    @GetMapping
    String home() {
        return "Hello World \r\n";
    }

}
