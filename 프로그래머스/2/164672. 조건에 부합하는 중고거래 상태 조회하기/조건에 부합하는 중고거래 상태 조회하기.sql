-- 코드를 입력하세요
SELECT u.BOARD_ID	, u.WRITER_ID, u.TITLE, u.PRICE, 
case when u.STATUS = 'SALE' then '판매중'
when u.STATUS = 'RESERVED' then '예약중'
else '거래완료' end 'STATUS'
from USED_GOODS_BOARD u
where substring( u.CREATED_DATE, 1, 10) = '2022-10-05'
order by u.BOARD_ID desc