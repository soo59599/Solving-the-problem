-- 코드를 입력하세요
SELECT i.ANIMAL_ID, i.ANIMAL_TYPE, i.NAME
from ANIMAL_INS i
inner join ANIMAL_OUTS o
on i.ANIMAL_ID = o.ANIMAL_ID
where substring(i.SEX_UPON_INTAKE, 1, 6) = 'Intact' and (substring(o.SEX_UPON_OUTCOME, 1, 6)='Spayed' or substring(o.SEX_UPON_OUTCOME, 1, 6)='Neuter')