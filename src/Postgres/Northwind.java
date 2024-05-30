package Postgres;

public class Northwind {
}
/*
--Напишите запрос для получения алфавитного списка продуктов,
--не снятых с производства (discontinued = false) (id и названий).
SELECT product_id,product_name
 FROM products
 WHERE discontinued = 0
 ORDER BY product_name;

--Написать запрос для получения общего количества продуктов, количества продуктов,
--не снятых и снятых с производства
SELECT COUNT(*) FROM products
 UNION
 SELECT COUNT(*) FROM products WHERE discontinued = 1
 UNION
 SELECT COUNT(*) FROM products WHERE discontinued = 0;

--Написать запрос для получения самого дорогого и самого дешевого продукта
--(названия и цену за упаковку).
select discontinued,  count (product_name)
from products group by discontinued;

--Вывести категории продуктов, поставщиков для каждой категории и
--количество поставляемых товаров (если это количество больше 1)
SELECT Count(product_name)
FROM Products GROUP BY Discontinued
having Discontinued=1;

--Написать запрос для получения списка продуктов, не снятых с производства,
--для которых стоимость находится в пределах между $15 и $25.
select product_name, unit_price from products where unit_price between 15 and 25;

 */
