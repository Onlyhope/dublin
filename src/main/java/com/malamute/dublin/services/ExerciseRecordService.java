package com.malamute.dublin.services;

import com.malamute.dublin.dtos.ExerciseRecordDto;
import com.malamute.dublin.entities.ExerciseRecord;
import com.malamute.dublin.repositories.ExerciseRecordRepository;
import org.springframework.stereotype.Service;

@Service
public class ExerciseRecordService {

    private final ExerciseRecordRepository repo;

    public ExerciseRecordService(ExerciseRecordRepository repo) {
        this.repo = repo;
    }

    public void save(ExerciseRecordDto exerciseRecordDto) {
        repo.save(dtoToEntity(exerciseRecordDto));
    }

    private ExerciseRecord dtoToEntity(ExerciseRecordDto dto) {
        ExerciseRecord entity = new ExerciseRecord();
        entity.setExerciseName(dto.getExerciseName());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setCompletedDate(dto.getCompletedDate());
        return entity;
    }

    private ExerciseRecordDto entityToDto(ExerciseRecord entity) {
        ExerciseRecordDto dto = new ExerciseRecordDto();
        dto.setExerciseName(entity.getExerciseName());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setCompletedDate(entity.getCompletedDate());
        return dto;
    }


}
