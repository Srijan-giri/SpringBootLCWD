-- string functions

select * from students;

-- 1. length

select length("Learn code with durgesh") "Length";

select name "STUDENT NAME",length(name) "Length" from students;

-- 2. concatenation

select concat("Learn code ","with Durgesh","---->","Subscribe on youtube") "CONCATENATION";

select * from students; 

select concat(name,"---->",city,"---->",fees) "STUDENT NAME_CITY_FEES"from students;

-- 3. lowercase

select lcase("LEARN CODE WITH DURGESH");

-- 4. uppercase

select ucase("Learn code with durgesh");

-- 5. Substring

select substring("learn code with durgesh",1,5) "SUBSTRING";

-- 6. trim

select trim("    LCWD   ") as "TRIM";
select trim("  learn code with durgesh    ") as "TRIM";

-- 7.reverse

select reverse("LCWD");
select reverse(name) from students;


-- 8.Compare

select strcmp("AB","AC") "STRCMP"; -- AC<AB -> -1
select strcmp("AC","AB") "STRCMP"; -- AC>AB -> 1
select strcmp("AC","AC") "STRCMP"; -- AC=AC -> 0

select strcmp("Abhishek","Abhinav");



