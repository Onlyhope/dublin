package com.malamute.dublin.daos;

import com.malamute.dublin.entities.ExerciseRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Resource: https://www.journaldev.com/2593/spring-jdbc-example#spring-jdbc-dependencies
 */
@Repository
public class ExerciseRecordDaoImplJdbc implements ExerciseRecordDao {

    private final Logger log = LoggerFactory.getLogger(ExerciseRecordDaoImplJdbc.class);

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    ExerciseRecordDaoImplJdbc(JdbcTemplate jdbcTemplate) {
        log.info("Injecting {} implementation", this.getClass().getSimpleName());
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public ExerciseRecord save(ExerciseRecord exerciseRecord) {

        String query = "insert into exercise_record (exercise_name, created_date, completed_date) values (?, ?, ?)";
        Object[] args = new Object[]{
                exerciseRecord.getExerciseName(),
                exerciseRecord.getCreatedDate(),
                exerciseRecord.getCompletedDate()
        };
        int status = jdbcTemplate.update(query, args);

        if (status == 0) return null;

        return exerciseRecord;
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
