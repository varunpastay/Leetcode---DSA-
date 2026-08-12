select e.name as Employee from Employee m join Employee e
on e.managerId=m.id
where e.salary>m.salary;