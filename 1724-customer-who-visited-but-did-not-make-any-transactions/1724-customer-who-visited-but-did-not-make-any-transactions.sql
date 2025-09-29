# Write your MySQL query statement below
select v.customer_id, count(1) count_no_trans 
from visits v
left join Transactions t
on v.visit_id = t.visit_id
where v.visit_id not in (
    select distinct visit_id
    from Transactions
    where amount is not null
)
group by v.customer_id;