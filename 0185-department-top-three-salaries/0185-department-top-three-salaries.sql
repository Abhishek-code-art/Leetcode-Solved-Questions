# Write your MySQL query statement below
SELECT 
    dep.name AS 'Department',
    emp.name AS 'Employee',
    emp.salary AS 'Salary'
FROM
    Employee emp 
        JOIN
    Department dep
        ON emp.departmentId = dep.id
WHERE
    3 > ( SELECT
            COUNT(DISTINCT(emp2.salary))
          FROM
            Employee emp2
          WHERE
            emp2.salary > emp.salary
                    AND
            emp2.DepartmentId = emp.DepartmentId        
        )
;