package Postgres;

public class Postgres {
}
/*
--Создать представление (view), в котором содержится категория продукта, название продукта и цена за единицу продукта
create view prod_cat as
select product_name, category_name, unit_price from products
left join categories on products.category_id = categories.category_id;

--Используя представление, вывести количество продуктов в каждой категории и общее количество продуктов
select category_name, count(*) from prod_cat
group by category_name
union all
select 'Total', count(*) from prod_cat;

--Cross join
create temporary table ranks(name varchar(2));
create temporary table suits(name varchar(10));
INSERT INTO ranks(name) VALUES('6'),('7'),('8'),('9'),('10'),('В'),('Д'),('К'),('Т');
INSERT INTO suits(name) VALUES ('пики'),('червы'),('бубны'),('трефы');
create temporary table cards as select * from ranks cross join suits;

--Transaction
drop table if exists accounts;
drop table if exists account_changes;

CREATE TABLE accounts (
	account_no serial NOT NULL,
	balance DECIMAL NOT NULL DEFAULT 0,
	PRIMARY KEY(account_no),
        CHECK(balance >= 0)
);

CREATE TABLE account_changes (
	change_no serial PRIMARY KEY,
	account_no INTEGER NOT NULL,
	flag TEXT NOT NULL,
	amount DECIMAL NOT NULL,
	changed_at TEXT NOT NULL
);

INSERT INTO accounts (balance) VALUES (2000);
INSERT INTO accounts (balance) VALUES (1000);

BEGIN TRANSACTION;
UPDATE accounts SET balance = balance - 100 WHERE account_no = 1;
UPDATE accounts SET balance = balance + 100 WHERE account_no = 2;
INSERT INTO account_changes(account_no,flag,amount,changed_at)
VALUES(1,'-',100,now());

INSERT INTO account_changes(account_no,flag,amount,changed_at)
VALUES(2,'+',100,now());

COMMIT;
 */