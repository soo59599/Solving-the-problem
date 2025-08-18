-- 코드를 입력하세요
SELECT o.ANIMAL_ID	, o.name
from  ANIMAL_OUTS o
left join ANIMAL_INS i
on i.ANIMAL_ID = o.ANIMAL_ID
where i.INTAKE_CONDITION is null
order by o.ANIMAL_ID