package com.malamute.dublin.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

@Table("exercise_record")
public class ExerciseRecord {

    @Id public Long exRecId;
    @Column("exercise_nam") public String exerciseName;
    @Column("created_date") public Instant createdDate;
    @Column("completed_date") public Instant completedDate;

}
