-- insert data into this students table
desc students;

insert into students(id,name,city) 
values (12,"Ankit Tiwari","Mumbai");

select * from students;

insert into students(id,name,city) 
values (13,"Srijan Giri","Kolkata");

insert into students values(45,"Anu Malik","Hydrabad");

-- multiple values insert

insert into students(id,name,city)values 
(56,"Rahul Dravid","Mumbai"),
(67,"Virat Kohli","Delhi"),
(129,"Dinesh kartik","Lucknow");

insert into students(id,name,city)values (124,"Sachin Tendulkar","Mumbai");


-- update & delete

update students set city="Lucknow",name="Ankit Kumar Tiwari" where id=12;

select * from students;

update students set city="Mumbai" where id=45;

-- delete

delete from students where  id=129;

-- alias

select name,city from students;

select name,city from students where id=13;

select name as student_name , city as student_city from students; 

select name "STUDENT NAME " , city "STUDENT CITY" from students;

select s.name , s.city,s.id from students s;

select * from students;

-- select  and_or_not 

select * from students WHERE id=12;
select * from students WHERE name="Virat Kohli";
select * from students where city="Delhi";


select * from students where city="Mumbai" and name="Sachin Tendulkar";

select * from students where city="Delhi" or name="Sachin Tendulkar";

select * from students where city="Delhi" or name="Sachin Tendulkar" and id=124;
select * from students where city="Mumbai" and name="Sachin Tendulkar" and id=124;

select * from students where not city="Mumbai";


-- order by

select * from students ORDER BY name asc;
select * from students ORDER BY name desc;
select * from students ORDER BY name desc , city asc;

insert into students(id,name,city) values(23,"Ankit Kumar Tiwari","Lucknow");

select * from students;
select * from students order by name desc,city asc;


-- limit

select * from students limit 5;

select * from students order by name asc limit 5;


-- offset

select * from students;

select * from students limit 3 offset 2;

select * from students order by name desc limit 3 offset 2;













