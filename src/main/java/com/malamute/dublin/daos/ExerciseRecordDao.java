package com.malamute.dublin.daos;

import com.malamute.dublin.entities.ExerciseRecord;

import java.util.List;

public interface ExerciseRecordDao {

    ExerciseRecord save(ExerciseRecord exerciseRecord);
    ExerciseRecord update(ExerciseRecord exerciseRecord);
    ExerciseRecord getById(Long id);
    void deleteById(Long id);
    List<ExerciseRecord> getAll();

}
