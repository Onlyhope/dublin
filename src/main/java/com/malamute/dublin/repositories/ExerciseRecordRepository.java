package com.malamute.dublin.repositories;

import com.malamute.dublin.entities.ExerciseRecord;
import org.springframework.data.repository.CrudRepository;

/**
 * Spring Repository with CRUD methods
 */
public interface ExerciseRecordRepository extends CrudRepository<ExerciseRecord, Long> {

}
