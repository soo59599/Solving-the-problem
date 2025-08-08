-- 코드를 입력하세요
SELECT distinct(c.CAR_ID)
from CAR_RENTAL_COMPANY_CAR c
inner join CAR_RENTAL_COMPANY_RENTAL_HISTORY h
on c.CAR_ID = h.CAR_ID
where CAR_TYPE = '세단' and substring(START_DATE	,1,7) = '2022-10'
order by c.CAR_ID desc