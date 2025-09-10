-- 코드를 입력하세요
SELECT f.flavor
from FIRST_HALF f
join JULY j
on f.FLAVOR	= j.FLAVOR
group by f.flavor
order by sum(f.TOTAL_ORDER)+sum(j.TOTAL_ORDER) desc
limit 3