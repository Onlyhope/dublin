package com.malamute.dublin.services;

import com.malamute.dublin.daos.ExerciseRecordDao;
import com.malamute.dublin.dtos.ExerciseRecordDto;
import com.malamute.dublin.entities.ExerciseRecord;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@Service
public class ExerciseRecordService {

    private final ExerciseRecordDao dao;

    public ExerciseRecordService(ExerciseRecordDao dao) {
        this.dao = dao;
    }

    public void save(ExerciseRecordDto exerciseRecordDto) {
        dao.save(dtoToEntity(exerciseRecordDto));
    }

    private ExerciseRecord dtoToEntity(ExerciseRecordDto dto) {
        ExerciseRecord entity = new ExerciseRecord();
        entity.setExerciseName(dto.getExerciseName());
        entity.setCreatedDate(Timestamp.from(dto.getCreatedDate()));
        entity.setCompletedDate(Timestamp.from(dto.getCompletedDate()));
        return entity;
    }

    private ExerciseRecordDto entityToDto(ExerciseRecord entity) {
        ExerciseRecordDto dto = new ExerciseRecordDto();
        dto.setExerciseName(entity.getExerciseName());
        dto.setCreatedDate(timestampToInstant(entity.getCreatedDate()));
        dto.setCompletedDate(timestampToInstant(entity.getCompletedDate()));
        return dto;
    }

    private static Instant timestampToInstant(Timestamp timestamp) {
        return timestamp == null ? null : timestamp.toInstant();
    }

}
