# Write your MySQL query statement below
select d.name department,e.name Employee,e.salary Salary from Employee e
inner join department d on e.departmentId = d.id
where (departmentId,salary) in (select departmentId,max(salary) from Employee
group by departmentId)