select first_name from actor union select first_name from customer order by first_name;
select first_name from actor intersect select first_name from customer order by first_name;
select first_name from actor except select first_name from customer order by first_name;