create table items (
item_id integer primary key,
status char,
name varchar2(20),
coder_id integer);

create table coders
as
select employee_id as coder_id, first_name, last_name, hire_date, salary
from hr.employees
where department_id = 60;

select *
from coders;

alter table items add counter number(38, 0);

select *
from items;

alter table items add constraint items_status_ck check(status in ('A', 'B', 'X'));
alter table coders add constraint coders_name_uq unique(first_name, last_name);

insert into items(item_id)
values (1);

insert into items(item_id,status)
values (2,'A');