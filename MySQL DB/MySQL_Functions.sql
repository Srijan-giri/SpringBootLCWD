-- MySQL Functions

select * from students;

alter table students add fees int(10) not null;

desc students;

update students set fees=3000 where id =12;
update students set fees=3000 where id =13;
update students set fees=3000 where id =23;
update students set fees=3000 where id =45;
update students set fees=4000 where id =56;
update students set fees=4000 where id =67;
update students set fees=4000 where id =124;


-- count --> rows count 

select count(id) as student_count from students;

select count(id) "STUDENT_COUNT" from students where city="Mumbai";
select count(id) "STUDENT_COUNT" from students where city="Delhi";
select count(id) "STUDENT_COUNT" from students where city="Lucknow";


-- sum 

select * from students;

select sum(fees) "TOTAL FEES" from students;
select sum(fees) "TOTAL FEES" from students where city="Delhi";
select sum(fees) "TOTAL FEES" from students where city="Mumbai";


-- avg

select avg(fees) "AVERAGE FEES" from students;
select avg(fees) "AVERAGE FEES" from students where city="Mumbai";
select avg(fees) "AVERAGE FEES" from students where city="Delhi";
select avg(fees) "AVERAGE FEES" from students where city="Lucknow";
select avg(fees) "AVERAGE FEES" from students where city="Kolkata";





