package Examples;
/*
--Database structure .ddl
create table mails(id integer primary key autoincrement, mail text);
create table phones(id integer primary key autoincrement, phone text);
create table mails_phones(id integer primary key autoincrement, mail_id int, phone_id int);

--Add data .sql
INSERT INTO mails VALUES('a@gmail.com');
INSERT INTO mails VALUES('b@gmail.com');
INSERT INTO mails VALUES('c@gmail.com');
insert into phones(phone) values (+3751234),(+3752234),(+3753234);
insert into mails_phones (mail_id, phone_id) values (1,1),(2,3);
 */
public class SQL {
}
