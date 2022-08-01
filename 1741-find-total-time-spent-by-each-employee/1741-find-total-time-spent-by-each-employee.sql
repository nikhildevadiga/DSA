# Write your MySQL query statement below
select event_day AS day, emp_id, sum(out_time-in_time) AS total_time from Employees group by 1,2;