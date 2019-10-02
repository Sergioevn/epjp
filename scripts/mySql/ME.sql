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

declare
v_id coders.coder_id%type := 105;
v_salary coders.salary%type;
begin
get_coder_salary(v_id, v_salary);
dbms_output.put_line('Salary is ' || v_salary);
exception
when others then
dbms_output.put_line('Can''t get salary for ' || v_id);
end;
/