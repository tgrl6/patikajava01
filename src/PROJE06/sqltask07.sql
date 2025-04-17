select rating, count(*) as film_sayisi from film group by rating;
select  replacement_cost, count(*) as film_sayisi from film group by  replacement_cost having count(*) > 50 order by film_sayisi desc;
select store_id, count(*) as musteri_sayısı from customer group by store_id;
SELECT country_id, COUNT(*) AS sehir_sayisi FROM city GROUP BY country_id ORDER BY sehir_sayisi DESC LIMIT 1;