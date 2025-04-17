select distinct replacement_cost from film order by replacement_cost;
select count(distinct replacement_cost) as farkli_sayi from film;
select count(*) as toplam from film where title like 'T%' and rating='G';
select count(*) as bes_karekterli_olke_sayisi from country where length(country)=5;
select count(*) as sonu_r_ile_biten_sehirler from city where city ilike '%r';