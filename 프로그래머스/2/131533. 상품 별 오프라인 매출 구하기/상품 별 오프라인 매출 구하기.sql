-- 코드를 입력하세요
SELECT p.PRODUCT_CODE, sum( p.PRICE * o.SALES_AMOUNT) m
from PRODUCT p
inner join OFFLINE_SALE o
on p.PRODUCT_ID = o.PRODUCT_ID
group by PRODUCT_CODE
order by m desc, p.PRODUCT_CODE
