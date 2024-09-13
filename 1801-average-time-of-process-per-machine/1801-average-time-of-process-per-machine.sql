# Write your MySQL query statement below
with start_activity as(
    select sum(timestamp) as processing_time,machine_id,count(*) as cnt from Activity where activity_type='start' group by machine_id
),
end_activity as(
    select sum(timestamp) as processing_time,machine_id from Activity where activity_type='end' group by machine_id
)
select t1.machine_id,round((t2.processing_time-t1.processing_time)/cnt,3) as processing_time from start_activity t1 left join end_activity t2 ON t1.machine_id = t2.machine_id