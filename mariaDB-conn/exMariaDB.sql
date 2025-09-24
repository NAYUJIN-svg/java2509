show tables;

select now();

select * from departments;

drop table users;
--
--create table users(
--	id varchar(5),
--	name varchar(100)
--	
--);

create table if not exists users(
	id varchar(50),
	name varchar(100)
);
