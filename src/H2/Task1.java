package H2;

public class Task1 {
}
/*
--Вывести персонажей, их расы и классы
select character.name, race.name,class.name
from character
inner join race on character.race_id=race.id
inner join class on character.class_id=class.id
order by character.name, race.name;

--Сколько у каждого персонажа вещей в инвентаре?
select c.name, count(i.id)
from character as c, item as i, inventory as inv
where (c.id=inv.character_id) and (i.id=inv.item_id)
group by c.name;

--У кого из эльфов имя начинается на "T"?
select c.name from character as c
inner join race as r on (c.race_id=r.id)
where r.name='Elves';

--У кого из воинов самое короткое имя?
select c.name from character as c
inner join class as cl on (c.class_id=cl.id)
where cl.name='Warrior'
order by length(c.name)
limit 1;

--Вывести список всех людей-лучников
select character.name from character
inner join class on character.class_id=class.id
inner join race on  character.race_id=race.id
where class.name='Archer' and race.name='Humans';

--Какой класс самый распространенный у гномов?
select class.name,count(character.class_id) as count from character
join class on character.class_id=class.id
join race on character.race_id=race.id
where race.name = 'Dwarves'
group by class.name order by count desc
limit 1;

--Вывести количество персонажей в каждой расе
select r.name, count(c.id)
from character as c left join race as r
on (c.race_id=r.id)
group by r.id;

--Сколько персонажей не принадлежат к известной расе?
select count from
(select r.name, count(c.id) as count
from character as c
left join race as r
on (c.race_id=r.id)
group by r.id) as t
where t.name is null;

--У кого из гномов есть серебро?
select c.name, r.name, i.name
from character as c
inner join race as r on (c.race_id=r.id)
inner join inventory as inv
on (inv.character_id=c.id)
inner join item as i on (inv.item_id=i.id)
where r.name='Dwarves' and
i.name like '%silver%';

--Каждому гному раздать по серебряной руде (Silver ore)
--1. Получить id для Silver Ore
select id from item
where name='Silver Ore';

--2. Получить id всех гномов и сохранить во временную таблицу
drop table if exists dwarves;
create temp table dwarves as
select c.id, (select id from item
where name='Silver Ore')
from character as c
left join race as r on (c.race_id=r.id)
where r.name='Dwarves';

--3. Добавить в инвентарь
insert into inventory(character_id, item_id)
select * from dwarves;

--Вывести по 3 самых тяжелых вещи в инвентаре для каждого персонажа
select * from weights as w
where (select count(*) from weights where
w.id = id and weight >= w.weight) <= 3;

--Удалить из инвентаря вещи, если их количество превышает 30 для одного персонажа
--1. Персонажи, у которых количество вещей в инвентаре больше 30 (показать количество лишних предметов)
select id, name, cn-30 as extra
from (select c.id, c.name, count(i.id) as cn
from character as c, item as i, inventory as inv
where (c.id=inv.character_id) and (i.id=inv.item_id)
group by c.id order by cn)
where cn>30;

--2. Сохранить id персонажей и количество лишних вещей в инвентаре во временную таблицу
drop table if exists char_ids;
create temp table char_ids as
select id, name, cn-30 as extra
from (select c.id, c.name, count(i.id) as cn
from character as c, item as i, inventory as inv
where (c.id=inv.character_id) and (i.id=inv.item_id)
group by c.name order by cn)
where cn>30;
select * from char_ids;

--3. Найти все id у предметов в перегруженных инвентарях
drop table if exists inv_ids;
create temp table inv_ids as
select inv.id, c.id as character_id, ch.extra
from character as c, inventory as inv, item as i, char_ids as ch
where (c.id=inv.character_id) and (i.id=inv.item_id)and(ch.id=c.id)
order by c.id;
select * from inv_ids limit 20;

--4. Найти лишние предметы
drop table if exists inv_ext;
create temp table inv_ext as
select * from inv_ids as i
where (select count(*) from inv_ids where (
i.id >= id) and (i.character_id=character_id)) <= extra;
select * from inv_ext;

--5. Удалить лишние предметы
delete from inventory
where id in(select id from inv_ext);
*/
