# Write your MySQL query statement below
-- select  max(salary) as SecondHighestSalary from Employee where 
-- salary<(select  max(salary) from Employee);


select(
    Select distinct salary from Employee 
    order by salary desc
     limit 1 Offset 1
)as SecondHighestSalary;