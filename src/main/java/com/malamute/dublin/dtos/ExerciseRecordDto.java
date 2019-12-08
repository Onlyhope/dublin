package com.malamute.dublin.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.List;

public class ExerciseRecordDto {

    @JsonProperty("exercise_name") private String exerciseName;
    @JsonProperty("sets") private List<ExerciseSetDto> exerciseSets;
    @JsonProperty("created_date") private Instant createdDate;
    @JsonProperty("completed_date") private Instant completedDate;

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public List<ExerciseSetDto> getExerciseSets() {
        return exerciseSets;
    }

    public void setExerciseSets(List<ExerciseSetDto> exerciseSets) {
        this.exerciseSets = exerciseSets;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Instant completedDate) {
        this.completedDate = completedDate;
    }

    @Override
    public String toString() {
        return "ExerciseRecordDto{" +
                "exerciseName='" + exerciseName + '\'' +
                ", exerciseSets=" + exerciseSets +
                ", createdDate=" + createdDate +
                ", completedDate=" + completedDate +
                '}';
    }
}