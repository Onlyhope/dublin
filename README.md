# Dublin

RESTful APIs for Exercise Records

## Getting Started

Built with embedded H2 Database.

http://localhost:8080/h2-console

Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: ""

## Endpoints

**GET - /users/{user_id}/exercise-records/**

Fetch a list of exercise records for the given user

Params:
  - fromCreated 
  - toCreated
  - fromCompleted
  - toCompleted

**POST - /users/{user_id}/exercise-records/**

Creates an exercise record for the given user

```json
{
  "exerciseName": "Squat",
  "sets": [
    {"weight": 95, "reps": 5},
    {"weight": 115, "reps": 5},
    {"weight": 135, "reps": 10}
  ],
  "createdDate": "2019-11-02T15:16:18.382Z",
  "completedDate": "2019-11-02T15:16:18.382Z"
}
```

**PUT - /users/{user_id}/exercise-records/{ex_rec_id}**

```json
{
  "exerciseName": "Front Squat",
  "sets": [
    {"weight": 95, "reps": 5},
    {"weight": 115, "reps": 5},
    {"weight": 135, "reps": 10},
    {"weight": 155, "reps": 8},
    {"weight": 175, "reps": 6}
  ],
  "createdDate": "2019-11-02T15:16:18.382Z",
  "completedDate": "2019-11-02T15:18:26.079Z"
}
```

Saves the exercise record for the given user

**DELETE - /users/{user_id}/exercise-records/{ex_rec_id}**

Removes the exercise record for the given user

