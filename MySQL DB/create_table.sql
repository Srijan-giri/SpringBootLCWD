-- create table

CREATE TABLE students
(id int(9) primary key,name varchar(100) not null,city varchar(25) not null);

show tables;

desc students;

-- alter table

alter table students add phone varchar(10);
alter table students modify phone varchar(15) not null;

desc students;

alter table students modify phone int(10) not null;

alter table students RENAME COLUMN phone TO student_phone;

alter table students drop column student_phone;




