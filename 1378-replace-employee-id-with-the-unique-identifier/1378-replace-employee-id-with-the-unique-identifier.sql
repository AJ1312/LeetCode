# Write your MySQL query statement below
select e.unique_id, p.name
FROM Employees p
LEFT JOIN EmployeeUNI e 
ON e.id = p.id;