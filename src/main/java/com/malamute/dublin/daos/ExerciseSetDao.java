package com.malamute.dublin.daos;

import com.malamute.dublin.entities.ExerciseSet;

import java.util.List;

public interface ExerciseSetDao {

    ExerciseSet save(ExerciseSet exerciseSet, Long exRecId);
    ExerciseSet updateByIdentity(Long exerciseSet, Long exRecId);
    ExerciseSet getByIdentity(Long exSetId, Long exRecId);
    void deleteByIdentity(Long exSetId, Long exRecId);
    List<ExerciseSet> getAllByExRecId(Long exRecId);

}
