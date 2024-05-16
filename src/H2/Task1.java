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
--Какой класс воинов самый распространенный у гномов?
--Вывести количество персонажей в каждой расе
--Сколько персонажей не принадлежат к известной расе?
--У кого из гномов есть серебро?
--Каждому гному раздать по серебряной руде (Silver ore)
--Вывести по 3 самых тяжелых вещи в инвентаре для каждого персонажа
--Удалить из инвентаря вещи, если их количество превышает 30 для одного персонажа
 */
