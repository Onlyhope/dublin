package com.malamute.dublin.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExerciseSetDto {

    @JsonProperty("weight") public Integer weight;
    @JsonProperty("reps") public Integer reps;

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