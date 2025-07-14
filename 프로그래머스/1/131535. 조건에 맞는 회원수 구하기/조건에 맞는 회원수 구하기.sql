-- 코드를 입력하세요
SELECT count(*)
from USER_INFO 
where substring(JOINED, 1, 4) = 2021 && age>=20 && age<=29