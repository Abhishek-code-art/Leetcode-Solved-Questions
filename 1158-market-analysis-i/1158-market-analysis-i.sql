# Write your MySQL query statement below
SELECT u.user_id AS buyer_id, join_date, IFNULL(COUNT(order_date), 0) AS orders_in_2019 
FROM Orders AS o 
RIGHT JOIN Users AS u ON o.buyer_id = u.user_id AND YEAR(order_date) = '2019'
GROUP BY u.user_id;