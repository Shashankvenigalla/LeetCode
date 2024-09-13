select machine_id, round(avg(case when activity_type = 'start' then -timestamp else timestamp end)*2,3) processing_time from activity group by machine_id
