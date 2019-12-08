package com.malamute.dublin.controllers;

import com.malamute.dublin.dtos.ExerciseRecordDto;
import com.malamute.dublin.entities.ExerciseRecord;
import com.malamute.dublin.repositories.ExerciseRecordRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExerciseRecordController {

    private final Logger log = LoggerFactory.getLogger(ExerciseRecordController.class);

    private final ExerciseRecordRepository exerciseRecordRepo;

    public ExerciseRecordController(ExerciseRecordRepository exerciseRecordRepo) {
        this.exerciseRecordRepo = exerciseRecordRepo;
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
        exerciseRecordRepo.save(dtoToEntity(exerciseRecordDto));
        log.info("Creating an exercise record for {}", userId);
        log.info("Exercise Record: {}", exerciseRecordDto);
        return ResponseEntity.ok(exerciseRecordDto);
    }

    ExerciseRecord dtoToEntity(ExerciseRecordDto dto) {
        ExerciseRecord entity = new ExerciseRecord();
        entity.setExerciseName(dto.getExerciseName());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setCompletedDate(dto.getCompletedDate());
        return entity;
    }

    ExerciseRecordDto entityToDto(ExerciseRecord entity) {
        ExerciseRecordDto dto = new ExerciseRecordDto();
        dto.setExerciseName(entity.getExerciseName());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setCompletedDate(entity.getCompletedDate());
        return dto;
    }

}
