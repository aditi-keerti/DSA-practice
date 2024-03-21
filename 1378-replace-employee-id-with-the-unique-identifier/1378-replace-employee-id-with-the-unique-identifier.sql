# Write your MySQL query statement below
Select eu.unique_id as unique_id,e.name as name from Employees e LEFT JOIN EmployeeUNI eu on e.id=eu.id;