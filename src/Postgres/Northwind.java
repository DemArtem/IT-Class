package Postgres;
/*
https://github.com/KirillovItstep/classworks/blob/main/NorthWind/northwind.sql
 */
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
SELECT product_name, unit_price FROM  products where unit_price between 15 and 25;

--Написать запрос, в котором вывести список продуктов, их категорию и
--поставщиков (название компании, контактное лицо).
SELECT product_name, category_name, company_name, contact_name
FROM products
INNER JOIN suppliers
ON products.supplier_id=suppliers.supplier_id
INNER JOIN categories
ON categories.category_id = products.category_id;

--Создать триггер, который добавляет в новую таблицу территории
--при добавлении ее в основную таблицу
CREATE TABLE territories (
    territory_id character varying(20) NOT NULL PRIMARY KEY,
    territory_description bpchar NOT NULL,
    region_id smallint NOT NULL,
	FOREIGN KEY (region_id) REFERENCES region
);
create trigger new_terr after insert on territories
begin
insert into new_territories (territory_description, region_id)
values (new.territory_description, new.region_id);
end;

--Вывести категории продуктов, поставщиков для каждой категории
--и количество поставляемых товаров (если это количество больше 1)
SELECT * FROM
 (SELECT categories.category_name, count(supplier_id) as suppl_count, sum(units_in_stock) as un_count
 FROM products
 JOIN categories ON products.category_id=categories.category_id
 GROUP BY categories.category_name) AS cat_supl_units
 WHERE un_count > 350;

select category_name, company_name, count(products.product_id) as count from categories
inner join products on categories.category_id=products.category_id
inner join suppliers on suppliers.supplier_id=products.supplier_id
group by category_name, company_name
having count>1
order by category_name;

--Написать продукты, где цена >1000$
SELECT EXISTS(SELECT * FROM products WHERE unit_price>1000);

 SELECT categories.category_name, suppliers.company_name,SUM(units_in_stock)
 FROM products
 JOIN categories ON
 categories.category_id=products.category_id
 JOIN suppliers ON
 suppliers.supplier_id=products.supplier_id
 GROUP BY categories.category_name,suppliers.company_name
 HAVING SUM(units_in_stock)>1
 ORDER BY category_name;
 */
