package com.malamute.dublin.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("exercise_set")
public class ExerciseSet {

    @Id
    public Long id;
    @Column("weight")
    private Integer weight;
    @Column("reps")
    private Integer reps;

    public Long getId() {
        return id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getReps() {
        return reps;
    }

    public void setReps(Integer reps) {
        this.reps = reps;
    }
}
