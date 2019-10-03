drop table trainees;
drop table courses;
drop sequence my_seq_courses;
drop sequence my_seq_trainee;
commit;
----create table Trainees-Courses
create table courses (
    course_id integer primary key,
    course_name varchar2(20),
    prof_name varchar2(20));
    
create table trainees (
    trainee_id integer primary key,
    first_name varchar2(20),
    last_name varchar2(20),
    constraint detail_name_status_uq unique(first_name, last_name),
    course_id integer
        constraint course_id_fk references courses(course_id));

--seq
create sequence my_seq_courses start with 101;
create sequence my_seq_trainee start with 1001;

--insert courses
    insert into courses (course_id, course_name, prof_name)
        values (my_seq_courses.nextval, 'Java', 'Galli');
        
    insert into courses (course_id, course_name, prof_name)
        values (my_seq_courses.nextval, 'Ethical Hacking', 'Verdi');
        
    insert into courses (course_id, course_name, prof_name)
        values (my_seq_courses.nextval, 'C++', 'Rossi');
            
-- insert trainees            
    insert into trainees (trainee_id, first_name, last_name, course_id)
        values (my_seq_trainee.nextval, 'Sergio', 'Evangelista', 101);
        
    insert into trainees (trainee_id, first_name, last_name, course_id)
        values (my_seq_trainee.nextval, 'Paolo', 'Riva', 101);
        
    insert into trainees (trainee_id, first_name, last_name, course_id)
        values (my_seq_trainee.nextval, 'Edoardo', 'Rossi', 102);
        
    insert into trainees (trainee_id, first_name, last_name, course_id)
        values (my_seq_trainee.nextval, 'Emanuele', 'Rossi', 102);
        
    insert into trainees (trainee_id, first_name, last_name, course_id)
        values (my_seq_trainee.nextval, 'Emanuele', 'Verdi', 103);
        
    insert into trainees (trainee_id, first_name, last_name, course_id)
        values (my_seq_trainee.nextval, 'Antonia', 'Bassi', 103);
        
    insert into trainees (trainee_id, first_name, last_name, course_id)
        values (my_seq_trainee.nextval, 'Paola', 'Grandi', 101);
        
    insert into trainees (trainee_id, first_name, last_name, course_id)
        values (my_seq_trainee.nextval, 'Chiara', 'Bartolini', 103);
            
    insert into trainees (trainee_id, first_name, last_name, course_id)
        values (my_seq_trainee.nextval, 'Chiara', 'Saporito', 102);
            
    
commit;
    
select first_name as Name, last_name as Surname, course_name as Course, prof_name as Prof 
from trainees join courses
using (course_id)
order by 3,2,1;



create or replace view phone_view as
    select first_name, last_name, phone_number
    from HR.employees;
   
select *
    from phone_view;

drop view phone_view;

declare
cursor v_phone_cursor is
select last_name, phone_number, first_name 
from phone_view
where last_name like 'A%' or first_name like 'A%'
order by 3,1
;
begin
for v_cur in v_phone_cursor loop
dbms_output.put_line(
'' || v_cur.first_name || ' ' || v_cur.last_name || '.
Phone: ' || v_cur.phone_number || '
');

end loop;
end;
/

create or replace procedure get_coder_salary(
p_coder_id in coders.coder_id%type,
p_salary out coders.salary%type) is
begin
select salary
into p_salary
from coders
where coder_id = p_coder_id;
end get_coder_salary;
/

drop procedure get_coder_salary;

set serveroutput on;

declare
v_id coders.coder_id%type := 1105;
v_salary coders.salary%type;
begin
get_coder_salary(v_id, v_salary);
dbms_output.put_line('Salary is ' || v_salary);
exception
when others then
dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/

create or replace procedure increase_coder_salary(
    p_coder_id in coders.coder_id%type,
    p_coder_inc in coders.salary%type,
    p_salary out coders.salary%type) is
begin
    select salary
    into p_salary
    from coders 
    where coder_id = p_coder_id;
        
    update coders
    set coders.salary= p_coder_inc + p_salary
    where coder_id = p_coder_id;
    end increase_coder_salary;
/

declare
    v_id coders.coder_id%type := 105;
    v_salary coders.salary%type;
    v_inc coders.salary%type:=100;
begin
    increase_coder_salary(v_id,v_inc,v_salary);
    dbms_output.put_line('Salary of ID ' || v_id || '= ' || v_salary || ' € increased by ' || v_inc || ' €');
exception
when others then
    dbms_output.put_line('Can''t get salary for ' || v_id);
end;


create or replace function increase_salary(
p_coder_id in coders.coder_id%type,
p_coder_inc in coders.salary%type)
return number as
v_salary coders.salary%type;
begin
select salary
into v_salary from coders
where coder_id = p_coder_id;
update coders
    set coders.salary= p_coder_inc + v_salary
    where coder_id = p_coder_id;
 
return v_salary+p_coder_inc;
end increase_salary;
/


commit;

declare
    v_id coders.coder_id%type := 105;
    v_inc coders.salary%type:=200;
    v_salary coders.salary%type;
begin
    v_salary := increase_salary(v_id,v_inc);
     dbms_output.put_line('Salary of ID ' || v_id || ' increased to ' || v_salary || ' € --> + ' || v_inc || ' €');
exception
when others then
    dbms_output.put_line('Can''t get salary for ' || v_id);
end;

commit;

ALTER TABLE coders
ADD CONSTRAINT coder_id PRIMARY KEY (coder_id);

create table coder_salaries (
coder_id number(6, 0)
references coders(coder_id),
old_salary number(8, 2),
new_salary number(8, 2)
);

create or replace trigger salary_update
before update of salary on coders
for each row
begin
insert into coder_salaries values(
:old.coder_id, :old.salary, :new.salary);
end salary_update;
/

update coders
set salary = salary * 1.3
where coder_id > 103;

commit;


create or replace procedure get_coder(
    p_coder_id in coders.coder_id%type,
    p_first_name out coders.first_name%type,
    p_last_name out coders.last_name%type) is
begin
    select first_name
    into p_first_name
    from coders
    where oder_id=p_coder_id;
    
    select last_name
    into p_last_name
    from coders
    where coder_id=p_coder_id;
    dbms_output.put_line(p_last_name || ' ' || p_first_name);
end get_coder;

declare
    v_id coders.coder_id%type := 105;
    v_last_name coders.last_name%type;
    v_first_name coders.first_name%type;
begin

    get_coder(v_id,v_first,v_last);
    end;
    
    
create or replace procedure tomorrow (
p_name in varchar2)
is
    begin 
    dbms_output.put_line('Tomorrow is ' || (sysdate +1) || ', dear ' || p_name);
end tomorrow;
/    