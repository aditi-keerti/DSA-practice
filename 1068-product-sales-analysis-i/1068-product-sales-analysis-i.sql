# Write your MySQL query statement below
Select p.product_name as product_name,s.year as year, s.price as price from Sales s JOIN Product p ON p.product_id=s.product_id;