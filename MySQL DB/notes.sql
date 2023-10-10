show databases;
create database [dbname]
drop database [dbname]
user [dbname]


-- create table

CREATE Table [tableName]([col1] coltype(size) extra.. );

-- show all  tables
show table;

-- description tables
desc [tableName]

-- table ALTER
-- add column

ALTER table [tablename] add [column_name] datatype;

-- modify COLUMN

ALTER table [tablename] MODIFY [column_name] [changed_datatype]

-- rename COLUMN

alter table [table_name] RENAME column [oldcolname] to [newcolname]

-- drop column

alter table [tablename] drop column [colname]

-- insert data to TABLE

insert into [tablename](cols) values(cols_values);

-- update TABLE

update [tableName] set col1=value,col2=value,col3=value
where id=12;

-- delete 

delete from [tableName] ; -- all rows will be deleted
delete from [tableName] where id=?;



-- order by ADD
select * from [tableName] order by [colname] asc/DESC

-- LIMIT

-- offset

-- alias


AVG
SUM
COUNT


-- String Functions

 1.LENGTH(str) --- find the length
 select length("Learn code with durgesh") "Length";

 2.CONCATE(str1,str2) - for concatenation

 3. LCASE(str) - to lowercase

 4. SUBSTRING(str,start,length) - extract part of the string

 5. TRIM(str) - remove leading and trailing spaces

6. Reverse - reverse the string

7. STRCMP(str1,str2) - compare two strings

    if str1 = str2 , this function returns 0;
    if str1 > str2 , this function returns 1;
    if str1 < str2 , this function returns -1;


Other important functions

1.CURDATE()-- returns the current date
2.CURTIME()-- returns the current time
3. NOW()-- return current date and time
4. IF(test,yes,no) -- return yes if test true else false
5. IFNULL(NULL,"TEST") - if null then TEST else value itself
6.DATABASE() -- RETURN THE CURRENT DATABASE


