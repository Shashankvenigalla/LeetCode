with cte1 as (select id, recordDate, 
lead(recordDate)over (order by recordDate) as lead_recordDate,
lead(temperature)over() as leadtemp,
lead(id)over()leadid,
temperature from Weather
order by recordDate)


select leadid as Id from cte1  
where DATEDIFF(lead_recordDate, recordDate)= 1  and temperature < leadtemp AND  recordDate < lead_recordDate