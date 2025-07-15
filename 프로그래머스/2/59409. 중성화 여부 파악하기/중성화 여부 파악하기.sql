-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, if(substring(SEX_UPON_INTAKE, 1, 4) = 'Neut' || substring(SEX_UPON_INTAKE, 1, 4) = 'Spay', 'O', 'X')
from ANIMAL_INS