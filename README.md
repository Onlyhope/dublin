# Dublin

RESTful APIs for Exercise Records

## Getting Started

Built with embedded H2 Database.

http://localhost:8080/h2-console

Driver Class: org.h2.Driver <br/>
JDBC URL: jdbc:h2:mem:testdb <br/>
User Name: sa <br/>
Password: "" <br/>

## Endpoints

**GET - /users/{user_id}/workouts/{workout_id}**

Fetch a list of exercise records for the given workout

**GET - /users/{user_id}/workouts**

Params:
  - fromCreated
  - toCreated

**GET - /users/{user_id}/exercise-records/**

Fetch a list of exercise records for the given user

Params:
  - fromCreated 
  - toCreated
  - fromCompleted
  - toCompleted

**GET - /users/{user_id}/exercise-records/{ex_rec_id}**

Fetch exercise records by user and exercise record Id.

**POST - /users/{user_id}/exercise-records/**

Creates an exercise record for the given user

```json
{
  "workout_id": "361a2ad1-25ce-4448-ab48-28a034c1ad09",
  "exercise_name": "Squat",
  "sets": [
    {"weight": 95, "reps": 5},
    {"weight": 115, "reps": 5},
    {"weight": 135, "reps": 10}
  ],
  "created_date": "2019-11-02T15:16:18.382Z",
  "completed_date": "2019-11-02T15:16:18.382Z"
}
```

**PUT - /users/{user_id}/exercise-records/{ex_rec_id}**

```json
{
  "workout_id": "361a2ad1-25ce-4448-ab48-28a034c1ad09",
  "exercise_name": "Bench",
  "sets": [
    {"weight": 95, "reps": 5},
    {"weight": 115, "reps": 5},
    {"weight": 135, "reps": 10},
    {"weight": 155, "reps": 8},
    {"weight": 175, "reps": 6}
  ],
  "created_date": "2019-11-02T15:16:18.382Z",
  "completed_date": "2019-11-02T15:18:26.079Z"
}
```

Saves the exercise record for the given user

**DELETE - /users/{user_id}/exercise-records/{ex_rec_id}**

Removes the exercise record for the given user

