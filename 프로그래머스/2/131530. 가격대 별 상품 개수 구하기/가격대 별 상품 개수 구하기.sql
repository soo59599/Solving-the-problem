-- 코드를 입력하세요
SELECT CASE 
        WHEN price < 10000 THEN 0
        ELSE FLOOR(price / 10000) * 10000
    END AS PRICE_GROUP, count(1) PRODUCTS
from PRODUCT
GROUP BY 
    CASE 
        WHEN price < 10000 THEN 0
        ELSE FLOOR(price / 10000) * 10000
    END
order by PRICE