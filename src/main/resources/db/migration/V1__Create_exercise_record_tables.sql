create table exercise_record (
    ex_rec_id int auto_increment,
    workout_id varchar(36) null,
    exercise_name varchar(256) not null,
    created_date timestamp,
    completed_date timestamp,
    primary key(ex_rec_id)
);

create table exercise_set (
    set_id int auto_increment,
    ex_rec_id int,
    weight int,
    reps int,
    primary key(set_id, ex_rec_id),
    foreign key(ex_rec_id) references exercise_record(ex_rec_id)
);