package Examples;
/*
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
 */
public class SQL {
}
