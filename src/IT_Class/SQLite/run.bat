"C:\Users\gk\.jdks\openjdk-21.0.1\bin\java.exe" -jar "C:\Users\gk\IdeaProjects\IT-Class\out\artifacts\intro_jar\intro.jar"
--Database structure .ddl
create table mails(id integer primary key autoincrement, mail text);
create table phones(id integer primary key autoincrement, phone text);
create table mails_phones(id integer primary key autoincrement, mail_id int, phone_id int);
create table users_info(id integer primary key autoincrement, users_id int, mails_phones_id int);
create table users(id integer primary key autoincrement, name text);  

--Add data .sql
INSERT INTO mails VALUES('a@gmail.com');
INSERT INTO mails VALUES('b@gmail.com');
INSERT INTO mails VALUES('c@gmail.com');
insert into phones(phone) values (+3751234),(+3752234),(+3753234);
insert into mails_phones (mail_id, phone_id) values (1,1),(2,3); 

select mails.mail, phones.phone from mails,phones,mails_phones where
mails_phones.mail_id=mails.id and mails_phones.phone_id=phones.id; 

select m.mail, p.phone from mails as m ,phones as p, mails_phones as mp
where mp.mail_id=m.id and mp.phone_id=p.id;

______________________________________________________________________________







SQLite version 3.45.3 2024-04-15 13:34:05 (UTF-16 console I/O)
Enter ".help" for usage hints.
Connected to a transient in-memory database.
Use ".open FILENAME" to reopen on a persistent database.
sqlite> .open employer.db
sqlite> drop table if exists employer;
sqlite> drop table if exists salary_grade;
sqlite> drop table if exists department;
sqlite>
sqlite> CREATE TABLE employer (
(x1...>                            id integer not null primary key autoincrement,
(x1...>                            name varchar(15) not null,
(x1...>                            job varchar(10),
(x1...>                            manager_id integer,
(x1...>                            hire_date text,
(x1...>                            salary float,
(x1...>                            commission float,
(x1...>                            department_id integer);
sqlite>
sqlite> CREATE TABLE department (
(x1...>                       id integer not null primary key autoincrement,
(x1...>                       name varchar(20) not null,
(x1...>                       location varchar(15));
sqlite>
sqlite> CREATE TABLE salary_grade (
(x1...>                        grade integer,
(x1...>                        min_salary integer,
(x1...>                        max_salary integer);
sqlite> .tables
department    employer      salary_grade
sqlite>BEGIN;
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id) 
 values (68319,'KAYLING','PRESIDENT',null,'1991-11-18',6000.00,null,1001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
values (66928, 'BLAZE', 'MANAGER', 68319, '1991-05-01', 2750.00,null, 3001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
values (67832, 'CLARE', 'MANAGER', 68319, '1991-06-09', 2550.00, null, 1001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
 values (65646, 'JONAS', 'MANAGER', 68319, '1991-04-02', 2957.00, null, 2001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
 values (67858, 'SCARLET', 'ANALYST', 65646, '1997-04-19', 3100.00, null, 2001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
 values (69062, 'FRANK', 'ANALYST', 65646, '1991-12-03', 3100.00, null, 2001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
 values (63679, 'SANDRINE', 'CLERK', 69062, '1990-12-18', 900.00, null, 2001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
 values (64989, 'ADELYN', 'SALESMAN', 66928, '1991-02-20', 1700.00, 400.00, 3001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
 values (65271, 'WADE', 'SALESMAN', 66928, '1991-02-22', 1350.00, 600.00, 3001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
 values (66564, 'MADDEN', 'SALESMAN', 66928, '1991-09-28', 1350.00, 1500.00, 3001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
 values (68454, 'TUCKER', 'SALESMAN', 66928, '1991-09-08', 1600.00, 0.00, 3001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
 values (68736, 'ADNRES', 'CLERK', 67858, '1997-05-23', 1200.00, null, 2001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
 values (69000, 'JULIUS', 'CLERK', 66928, '1991-12-03', 1050.00, null, 3001);
insert into employer(id,name,job,manager_id,hire_date,salary,commission,department_id)
 values (69324, 'MARKER', 'CLERK', 67832, '1992-01-23', 1400.00, null, 1001);

insert into department (id,name,location) values (1001, 'FINANCE', 'SYDNEY');
insert into department (id,name,location) values (2001, 'AUDIT', 'MELBOURNE');
insert into department (id,name,location) values (3001, 'MARKETING', 'PERTH');
insert into department (id,name,location) values (4001, 'PRODUCTION', 'BRISBANE');

insert into salary_grade (grade,min_salary,max_salary) values (1,800,1300);
insert into salary_grade (grade,min_salary,max_salary) values (2,1301,1500);
insert into salary_grade (grade,min_salary,max_salary) values (3,1501,2100);
insert into salary_grade (grade,min_salary,max_salary) values (4,2101,3100);
insert into salary_grade (grade,min_salary,max_salary) values (5,3101,9999);
commit; 

CREATE TABLE salary_grade (
                       grade integer,
                       min_salary integer,
                       max_salary integer);
.mode box					   
 
/*
--Напишите запрос в sql, чтобы отобразить id и имена менеджеров всех сотрудников.
SELECT * FROM employer;

--Напишите запрос в sql, чтобы найти сотрудника, который был нанят первым в 1991 году.
--суммарная зарплата всех менеджеров (MANAGER)
select sum(salary) from employer where job like 'manager'; 

Напишите запрос в sql, чтобы перечислить сотрудников, которые работают в той же должности, что и 
FRANK.select*from employer where job like (select job from employer where name = 'FRANK'); 

--Напишите запрос в SQL, чтобы отобразить сотрудников, имя менеджера которых JONAS

 
 --Перечислить сотрудников в отделе 1001, чья зарплата превышает среднюю зарплату сотрудников в отделе 2001
select name, salary from employer where department_id=1001 and salary >(select avg(salary) from employer where department_id=2001);





--Напишите запрос в sql, чтобы отобразить id, имя, должность, дату найма и стаж работы менеджеров.
--Напишите запрос в sql, чтобы перечислить id, имя, зарплату, название отдела всех MANAGER и ANALYST, работающих в SYDNEY, PERTH.
--Напишите запрос в sql, чтобы перечислить всех сотрудников 2 и 3 классов.
--Напишите запрос в sql, чтобы перечислить сведения о сотрудниках, чья зарплата превышает зарплату JONAS.
--Напишите запрос в sql, чтобы перечислить сотрудников, которые работают в той же должности, что и FRANK.
--Кого наняли раньше ADELYN?
--Напишите запрос на языке sql, чтобы составить список сотрудников отдела с id=2001,
-- которые работают в должностях, аналогичных отделу 1001.
--Напишите запрос в sql, чтобы найти информацию о наиболее высокооплачиваемом сотруднике
--Напишите запрос в sql, чтобы найти наиболее высокооплачиваемого сотрудника в отделе marketing
--Напишите запрос в SQL, чтобы отобразить общую зарплату сотрудников, относящихся к 3 классу.
--Перечислить сотрудников в отделе 1001, чья зарплата превышает среднюю зарплату сотрудников в отделе 2001
--Напишите запрос в SQL, чтобы перечислить сотрудников, которые не работают в отделе MARKETING
--Напишите запрос в SQL, чтобы перечислить имена сотрудников, которые получают самую высокую зарплату в каждом отделе
--Напишите запрос в SQL, чтобы перечислить сотрудников, чья зарплата меньше, чем зарплата его менеджера,
--но больше, чем зарплата любого другого менеджера.
--Напишите запрос в SQL, чтобы перечислить сотрудников и среднюю зарплату сотрудников по отделу, где они работают.
--Напишите запрос в SQL, чтобы получить название отдела, где количество сотрудников равно количеству символов в названии отдела
--Напишите запрос в SQL, чтобы перечислить имена менеджеров отдела, в котором работает максимальное количество сотрудников
--Напишите запрос в SQL, чтобы найти отдел, где нет сотрудников 
*/