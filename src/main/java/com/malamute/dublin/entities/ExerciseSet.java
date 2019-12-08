package com.malamute.dublin.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("exercise_set")
public class ExerciseSet {

    @Id public Long id;
    @Column("weight") public Integer weight;
    @Column("reps") public Integer reps;

}
