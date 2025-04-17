select count(*) as film_sayisi from film where length>(select avg(length) from film);
select count(*) as film_sayisi from film  where rental_rate = (select max(rental_rate) from film);
select * from film where rental_rate= (select min(rental_rate)from film ) and replacement_cost = (select min(replacement_cost) from film );
select customer_id, count(*) as toplam_satin_alim from payment group by customer_id order by toplam_satin_alim desc;
