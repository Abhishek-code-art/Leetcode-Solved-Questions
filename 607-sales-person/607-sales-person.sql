# Write your MySQL query statement below
SELECT SalesPerson.name FROM Orders AS o INNER JOIN Company AS c
ON (o.com_id = c.com_id AND c.name = 'RED')
RIGHT JOIN SalesPerson ON SalesPerson.sales_id = o.sales_id
WHERE o.sales_id IS NULL;