package com.malamute.dublin.controllers;

import com.malamute.dublin.dtos.ExerciseRecordDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExerciseRecordController {

    private final Logger log = LoggerFactory.getLogger(ExerciseRecordController.class);

    @GetMapping
    public String home() {
        return "Hello World \r\n";
    }

    @PostMapping(value = "/users/{user_id}/exercise-records")
    public ResponseEntity<ExerciseRecordDto> createExerciseRecord(
            @PathVariable("user_id") String userId,
            @RequestBody ExerciseRecordDto exerciseRecordDto
    ) {
        log.info("Creating an exercise record for {}", userId);
        log.info("Exercise Record: {}", exerciseRecordDto);
        return ResponseEntity.ok(exerciseRecordDto);
    }

}
