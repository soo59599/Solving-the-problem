-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, coalesce(TLNO,'NONE') TLNO
from PATIENT
where age<=12 && GEND_CD = 'W'
order by AGE desc, PT_NAME