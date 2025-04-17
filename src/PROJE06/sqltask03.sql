select country from country where country like 'A%a';
select country from country where length(country) >=6 and country like '%n';
select title from film where length(lower(title)) - length(replace(lower(title),'t', ''))>=4;
select * from film where title like 'C%' and length>90 and rental_rate=2.99;

