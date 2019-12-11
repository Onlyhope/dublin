package com.malamute.dublin.daos;

import com.malamute.dublin.entities.ExerciseRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExerciseRecordDaoImpl implements ExerciseRecordDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    ExerciseRecordDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public ExerciseRecord save(ExerciseRecord exerciseRecord) {
        return null;
    }

    @Override
    public ExerciseRecord getById(Long id) {
        return null;
    }

    @Override
    public ExerciseRecord update(ExerciseRecord exerciseRecord) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<ExerciseRecord> getAll() {
        return null;
    }

}
