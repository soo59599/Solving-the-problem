-- 코드를 입력하세요
SELECT b.CATEGORY, sum(s.SALES) TOTAL_SALES
from BOOK b inner join BOOK_SALES s
on b.BOOK_ID = s.BOOK_ID
where substring(SALES_DATE, 1, 7) = '2022-01'
group by b.CATEGORY
order by b.CATEGORY
