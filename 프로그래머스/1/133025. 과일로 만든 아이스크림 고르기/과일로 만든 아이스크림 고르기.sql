-- 코드를 입력하세요
SELECT h.FLAVOR 
FROM ICECREAM_INFO i
JOIN FIRST_HALF h
  ON h.FLAVOR = i.FLAVOR
  where h.TOTAL_ORDER>3000 and i.INGREDIENT_TYPE = 'fruit_based'
  order by h.TOTAL_ORDER desc