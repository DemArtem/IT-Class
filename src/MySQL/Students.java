package MySQL;

public class Students {
}
/*
drop table if exists student;
drop table if exists university;

create table university
(
    id integer primary key auto_increment,
    name varchar(160)
);

create table student
(
    id integer primary key auto_increment,
    surname varchar(60),
    name varchar(60),
    univ_id integer,
    foreign key (univ_id) references university (id)
);

insert into university (name) values ('московский физико-технический институт');
insert into university (name) values ('московский государственный университет дизайна и технологии');
insert into university (name) values ('владимирский государственный университет');
insert into university (name) values ('российский университет дружбы народов');
insert into university (name) values ('высшая школа экономики');

insert into student (surname, name, univ_id) values ('сергеев', 'сергей', 1);
insert into student (surname, name, univ_id) values ('клюквина', 'вера', 1);
insert into student (surname, name, univ_id) values ('кийко', 'ирина', 1);
insert into student (surname, name, univ_id) values ('водопьянова', 'виктория', 2);
insert into student (surname, name, univ_id) values ('тимашов', 'дмитрий', 2);
insert into student (surname, name, univ_id) values ('авраменко', 'владислав', 2);
insert into student (surname, name, univ_id) values ('величко', 'алексей', 3);
insert into student (surname, name, univ_id) values ('филипцов', 'артем', 3);
insert into student (surname, name, univ_id) values ('колдаева', 'елена', 3);
insert into student (surname, name, univ_id) values ('антипов', 'андрей', 4);
insert into student (surname, name, univ_id) values ('грачев', 'евгений', 4);
insert into student (surname, name, univ_id) values ('попова', 'дарья', 4);

create table student
(
    id integer primary key auto_increment,
    surname varchar(60),
    name varchar(60),
    univ_id integer,
    foreign key (univ_id) references university (id)
    on delete RESTRICT on update RESTRICT
    --on delete SET NULL on update SET NULL
    --no action
    --set default
);
 */
