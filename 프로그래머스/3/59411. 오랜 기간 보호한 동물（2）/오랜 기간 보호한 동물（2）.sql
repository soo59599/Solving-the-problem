-- 코드를 입력하세요
SELECT i.ANIMAL_ID, i.name
from ANIMAL_INS i
inner join ANIMAL_OUTS o
on i.ANIMAL_ID = o.ANIMAL_ID
order by DATEDIFF(o.DATETIME, i.DATETIME) desc
LIMIT 2