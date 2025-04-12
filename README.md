Script BD:
//copiar y pegar desde el renglon 4 hasta 23

create table residencia
(
    id         int auto_increment
        primary key,
    habitacion char(20) not null
);

create table santuario
(
    IdAnimal      int auto_increment
        primary key,
    nombre        char(20) not null,
    edad          int      not null,
    genero        char(20) not null,
    altura        char(20) not null,
    tipo          char(20) not null,
    residencia_id int      null,
    constraint santuario_residencia_id_fk
        foreign key (residencia_id) references residencia (id)
);

