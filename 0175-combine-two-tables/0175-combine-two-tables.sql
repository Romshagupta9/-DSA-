# Write your MySQL query statement below
#first solution
-- select p.firstName,p.lastName,a.city,a.state from Person p Left Join Address a on p.personId=a.personId;

#another solution
select Person.firstName,Person.lastName,Address.city,Address.state from Person left join  Address on Person.personId=Address.personId;