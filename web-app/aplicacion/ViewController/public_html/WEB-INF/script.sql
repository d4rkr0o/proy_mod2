create table prueba(
    id_prueba number primary key,
    prueba varchar2(15)
);

create table prueba_relacion(
    id_prueba_relacion number primary key,
    prueba_relacion varchar2(15),
    id_prueba number
);

alter table prueba_relacion add (
constraint fk_prueba_relacion foreign key (id_prueba) references prueba(id_prueba)
);

insert into prueba values(1,'prueba');
insert into prueba values(2,'prueba2');
insert into prueba values(3,'prueba3');