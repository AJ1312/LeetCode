# Write your MySQL query statement below
SELECT m.machine_id, 
ROUND(AVG(p.timestamp-m.timestamp),3) AS processing_time
FROM Activity m
JOIN Activity p
ON m.machine_id = p.machine_id AND p.process_id = m.process_id
WHERE m.activity_type="start" AND p.activity_type="end"
GROUP BY machine_id;
