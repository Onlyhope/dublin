package com.malamute.dublin.services;

import com.malamute.dublin.daos.ExerciseRecordDao;
import com.malamute.dublin.entities.ExerciseRecord;
import org.springframework.stereotype.Service;

@Service
public class ExerciseRecordService {

    private final ExerciseRecordDao dao;

    public ExerciseRecordService(ExerciseRecordDao dao) {
        this.dao = dao;
    }

    public void save(ExerciseRecord exerciseRecord) {
        dao.save(exerciseRecord);
    }

}
