
create table type
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(128),
    code VARCHAR(128) UNIQUE
);
create table breed
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(128),
    code VARCHAR(128) UNIQUE,
    type_id BIGINT
);
alter table breed
    add constraint pet_breed_id foreign key (type_id) references type (id);

create table master
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(64) NOT NULL,
    lastname  VARCHAR(64) NOT NULL,
    patronymic VARCHAR(64) ,
    telephone VARCHAR(64),
    email VARCHAR(64),
    address VARCHAR(128)
);


create table specialization
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(128),
    code VARCHAR(128) UNIQUE
);

create table doctor
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    firstname  VARCHAR(128) NOT NULL,
    lastname  VARCHAR(128) NOT NULL,
    patronymic  VARCHAR(128) ,
    specialization_id BIGINT,
    experience VARCHAR(1024),
    notes VARCHAR(1024)
);
alter table doctor
    add constraint pet_doctor_id foreign key (specialization_id) references specialization (id);



create table pet
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    master_id    BIGINT      NOT NULL,
    nickname VARCHAR(64) NOT NULL,
    breed_id BIGINT,
    colour VARCHAR(64),
    chip VARCHAR(64) UNIQUE,
    birth_date date,
    sex VARCHAR(64),
    sterilization VARCHAR(64)
);

alter table pet
    add constraint fk_pet_master_id foreign key (master_id) references master (id);

     alter table pet
        add constraint fk_pet_breed_id foreign key (breed_id) references breed (id);

create table reception
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    doctor_id BIGINT      NOT NULL,
    pet_id BIGINT      NOT NULL,
    datetime  timestamp,
    description VARCHAR(1024),
    heal VARCHAR(1024)
);
alter table reception
    add constraint reception_doctor_id foreign key (doctor_id) references doctor (id);
    alter table reception
        add constraint reception_pet_id foreign key (pet_id) references pet (id);

alter table reception
        add constraint reception_date_doctor_UNIQUE UNIQUE (datetime,doctor_id);