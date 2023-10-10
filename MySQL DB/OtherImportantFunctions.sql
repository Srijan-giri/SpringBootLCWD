-- OTHER IMPORTANT FUNCTION	

-- 1. Current Date : yyyy-MM-dd

select curdate() "CURRENT DATE";

-- 2.Current Time

select curtime() "CURRENT TIME";

-- 3. NOW()

select now() "NOW";

-- 4. year -

select year(curdate()) as year;

select year("2019-12-11");

-- 5. IF()

select if(10>20,"yes","no");
select if(5>4,"yes","no");


select name ,fees,if(fees>3200,"HAVE TO PAY","NOT REQUIRED") "STATUS" from students;

-- 6. ifnull()

select ifnull(NULL,"lcwd.com");

select ifnull("Tigers","lcwd.com");

select name,ifnull(name,"lcwd.com") as test from students;

-- 7. Database()

select database();

-- 8. version

select version();

-- 9. user

select user();

select database() "DATABASE",version() "VERSION", user() "USER";

-- 10. maths function  - 10 functions sin,cos,tan

