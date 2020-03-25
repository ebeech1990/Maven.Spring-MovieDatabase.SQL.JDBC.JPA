select * from movies where genre = 'Sci-Fi';

select * from movies where imdb_score > 6.4 ;

select * from movies where (runtime < 100) and (rating = 'G' or rating = 'PG') ;

select avg(runtime), genre  from movies group by genre having avg(imdb_score) < 7.5;

update movies set rating = 'R' where title = 'Starship Troopers';

select id, rating from movies where genre = 'Horror' or genre = 'Documentary';

select rating, avg(imdb_score), max(imdb_score), min(imdb_score) from movies group by rating;

select rating, avg(imdb_score), max(imdb_score), min(imdb_score) from movies group by rating having count(*) >1;

delete from movies where rating = 'R';