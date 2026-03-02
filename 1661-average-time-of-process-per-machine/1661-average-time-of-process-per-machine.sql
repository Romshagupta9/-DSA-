# Write your MySQL query statement below
select a1.machine_id,
round(avg(a2.timestamp-a1.timestamp),3) as processing_time
from Activity a1 join Activity a2 on a1.machine_id=a2.machine_id
where a2.activity_type='end' and a1.activity_type='start'
group by a1.machine_id;