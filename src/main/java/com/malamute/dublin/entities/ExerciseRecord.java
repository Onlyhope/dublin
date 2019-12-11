package com.malamute.dublin.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Timestamp;

@Table("exercise_record")
public class ExerciseRecord {

    @Id public Long exRecId;
    @Column("exercise_name") public String exerciseName;
    @Column("created_date") public Timestamp createdDate;
    @Column("completed_date") public Timestamp completedDate;

    public Long getExRecId() {
        return exRecId;
    }

    public void setExRecId(Long exRecId) {
        this.exRecId = exRecId;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Timestamp completedDate) {
        this.completedDate = completedDate;
    }


}
