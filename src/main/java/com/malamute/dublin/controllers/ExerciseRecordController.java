package com.malamute.dublin.controllers;

import com.malamute.dublin.dtos.ExerciseRecordDto;
import com.malamute.dublin.services.ExerciseRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExerciseRecordController {

    private final Logger log = LoggerFactory.getLogger(ExerciseRecordController.class);

    private final ExerciseRecordService service;

    public ExerciseRecordController(ExerciseRecordService exerciseRecordService) {
        this.service = exerciseRecordService;
    }

    @GetMapping
    public String home() {
        return "Hello World \r\n";
    }

    @PostMapping(value = "/users/{user_id}/exercise-records")
    public ResponseEntity<ExerciseRecordDto> createExerciseRecord(
            @PathVariable("user_id") String userId,
            @RequestBody ExerciseRecordDto exerciseRecordDto
    ) {
        service.save(exerciseRecordDto);
        log.info("Creating an exercise record for {}", userId);
        log.info("Exercise Record: {}", exerciseRecordDto);
        return ResponseEntity.ok(exerciseRecordDto);
    }

}
