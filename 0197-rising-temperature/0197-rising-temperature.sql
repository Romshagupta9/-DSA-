# Write your MySQL query statement below
# self joining the table
# using DATEDIFF function--check if they are consecutive days (with a difference of 1 day).
select w1.id from Weather w1, Weather w2
where datediff(w1.recordDate,w2.recordDate)=1 
and w1.temperature >w2.temperature ;