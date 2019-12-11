package com.malamute.dublin.daos;

import com.malamute.dublin.entities.ExerciseSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExerciseSetDaoImpl implements ExerciseSetDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    ExerciseSetDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public ExerciseSet save(ExerciseSet exerciseSet, Long exRecId) {
        return null;
    }

    @Override
    public ExerciseSet updateByIdentity(Long exerciseSet, Long exRecId) {
        return null;
    }

    @Override
    public ExerciseSet getByIdentity(Long exSetId, Long exRecId) {
        return null;
    }

    @Override
    public void deleteByIdentity(Long exSetId, Long exRecId) {

    }

    @Override
    public List<ExerciseSet> getAllByExRecId(Long exRecId) {
        return null;
    }
}
