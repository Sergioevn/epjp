DESCRIBE regions;

SELECT * 
FROM regions;

SELECT sysdate 
FROM dual;

SELECT 4*5 
FROM dual;

SELECT region_name 
FROM regions;

SELECT region_name
FROM regions 
WHERE region_id = 1 ; -- righe

SELECT ROWID, ROWNUM, region_name 
FROM regions;

SELECT table_name
FROM user_tables;

SELECT column_name, nullable, data_type, data_length, data_precision, data_scale
FROM user_tab_columns
WHERE table_name = 'JOBS';

SELECT 1+2, 3-4, 2*6, 5/2
FROM dual;

SELECT TO_DATE('30-NOV-2019') + 2, TO_DATE('02-NOV-2019') - 3 
FROM dual;

SELECT TO_DATE('02-NOV-2019') - TO_DATE('25-MAR-2019') AS "How many days"
FROM dual;

SELECT job_title, min_salary, min_salary + 2000, min_salary * 3 + 1000
FROM jobs; --tabella temporanea. Non modifica la tabella reale che è sul database.

SELECT first_name || ' ' || last_name AS "Employee's name"
FROM employees;

SELECT first_name, last_name, commission_pct
FROM employees
WHERE commission_pct IS NULL;

SELECT first_name, last_name, commission_pct
FROM employees
WHERE commission_pct IS NOT NULL;

SELECT first_name, last_name, 12 * salary * commission_pct
FROM employees;

SELECT first_name, last_name, 12 * salary * nvl(commission_pct, 0) AS "Annual Commission"
FROM employees;

SELECT first_name, last_name, 12 * salary * commission_pct
FROM employees
WHERE first_name= 'John' AND last_name= 'Russell';

SELECT COUNT(ROWID) 
FROM employees;

SELECT COUNT(DISTINCT manager_id)
FROM employees;

SELECT COUNT(DISTINCT first_name)
FROM employees;

SELECT * 
FROM regions 
WHERE region_id 
!= 2;

SELECT * 
FROM regions 
WHERE region_id > 
ANY(1, 2, 3);

SELECT * 
FROM regions 
WHERE region_id > 
ALL(1, 2, 3);

SELECT last_name 
FROM employees 
WHERE last_name 
LIKE '_ul%';

SELECT last_name 
FROM employees 
WHERE last_name 
LIKE 'S%h';

SELECT last_name 
FROM employees 
WHERE last_name 
LIKE '___';

SELECT * 
FROM regions 
WHERE region_id 
NOT IN (2, 3);

SELECT * 
FROM regions 
WHERE region_id 
BETWEEN 2 AND 3;

SELECT * 
FROM regions 
WHERE region_id 
NOT IN (2, 3, NULL);

SELECT * 
FROM employees 
WHERE manager_id 
IS NULL;

SELECT *
FROM employees
WHERE salary < 3000 AND employee_id > 195;

SELECT * 
FROM employees
WHERE salary > 20000 OR last_name = 'King';

SELECT * 
FROM employees
WHERE NOT department_id > 20;

SELECT * 
FROM employees
ORDER BY last_name;

SELECT * 
FROM employees
ORDER BY last_name DESC, first_name ASC;

SELECT first_name, last_name, email, phone_number, hire_date 
FROM employees
ORDER BY last_name, first_name;


SELECT first_name, last_name, email, phone_number, hire_date 
FROM employees
WHERE first_name='Peter' OR first_name='David'
ORDER BY last_name, first_name;

SELECT first_name, last_name, email, phone_number, hire_date 
FROM employees
WHERE department_id = 60;

SELECT first_name, last_name, email, phone_number, hire_date 
FROM employees
WHERE department_id = 30 OR department_id = 50;

SELECT first_name, last_name, email, phone_number, hire_date 
FROM employees
WHERE salary > 10000;

SELECT first_name, last_name, email, phone_number, hire_date 
FROM employees
WHERE salary > 15000 OR salary < 4000;

SELECT first_name, last_name, email, phone_number, hire_date 
FROM employees
WHERE (department_id= 50 OR department_id= 80) AND ( salary > 15000 OR salary < 4000);

SELECT first_name, last_name, email, phone_number, hire_date 
FROM employees
WHERE hire_date LIKE '%05';

SELECT DISTINCT job_id
FROM employees
ORDER BY job_id;

SELECT first_name, last_name, email, phone_number, hire_date 
FROM employees
WHERE commission_pct IS NOT NULL;

SELECT first_name, last_name, email, phone_number, hire_date 
FROM employees
WHERE first_name LIKE '%a%' OR first_name LIKE '%A%' 
OR last_name LIKE '%a%' OR last_name LIKE '%A%';

SELECT DISTINCT department_name
FROM departments;

SELECT street_address, city, postal_code
FROM locations
WHERE country_id= 'IT'; 

SELECT job_id
FROM jobs
WHERE job_title LIKE '%Clerk%';

SELECT street_address
FROM locations
WHERE postal_code IS NULL OR postal_code NOT LIKE '0%';

select region_name 
from regions 
where region_id = 1;

select country_name
from countries 
where region_id = 1;

select country_name, region_name
from regions, countries
where regions.region_id = countries.region_id;

select r.region_name, c.country_name
from regions r, countries c
where r.region_id = c.region_id;

select country_name, region_name
from regions join countries -- join è “inner” per default
using(region_id)
order by 1;

select country_name, region_name 
from regions natural join countries
order by 1;

select region_name, country_name
from regions r join countries c
on(r.region_id = c.region_id);

select e.last_name as employee, m.last_name as manager
from employees e join employees m
on (e.manager_id = m.employee_id)
order by 1;

-----Back to the lesson-----
SELECT country_name, region_name
FROM COUNTRIES, REGIONS
WHERE regions.region_id = countries.REGION_ID AND countries.REGION_ID = 2
ORDER BY COUNTRY_NAME
;
SELECT country_name, region_name
FROM regions JOIN COUNTRIES
USING (region_id)
ORDER BY 1
;
SELECT region_name, country_name
FROM regions, COUNTRIES
;
SELECT employee_id, first_name, LAST_NAME, city, department_name
FROM EMPLOYEES JOIN DEPARTMENTS USING(DEPARTMENT_id) JOIN LOCATIONS USING(LOCATION_id)
;
select e.last_name, e.salary, j.min_salary
from employees e join jobs j
on(e.salary between j.min_salary and j.min_salary + 100)
where(e.job_id = j.job_id)
;
select first_name, last_name, DEPARTMENT_ID, department_name
from employees right outer join departments
using(department_id)
where department_id between 110 and 120
;
select e.last_name, d.department_name
from employees e full outer join departments d
on (e.department_id = d.department_id)
where last_name = 'Grant'
or d.department_id between 110 and 120
;
-----Exercises-----
--1
SELECT first_name, LAST_NAME, department_name
FROM EMPLOYEES JOIN DEPARTMENTS
using(department_id)
;
--2
SELECT first_name, LAST_NAME, job_title
FROM EMPLOYEES JOIN JOBS
USING (job_id)
;
--3
SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES e JOIN JOBS j
USING (job_id)
WHERE e.SALARY = j.MIN_SALARY OR e.SALARY = j.MAX_SALARY
;
--4
SELECT FIRST_NAME, LAST_NAME, l.COUNTRY_ID
FROM EMPLOYEES e JOIN DEPARTMENTS d USING (DEPARTMENT_id)
JOIN LOCATIONS l USING (location_id)
WHERE l.COUNTRY_ID = 'UK'
;
--5
SELECT DEPARTMENT_NAME, first_name
FROM DEPARTMENTS d LEFT OUTER JOIN EMPLOYEES e ON (d.MANAGER_ID=e.EMPLOYEE_ID)
;
--6
SELECT DEPARTMENT_NAME, first_name
FROM DEPARTMENTS d JOIN EMPLOYEES e ON (d.MANAGER_ID=e.EMPLOYEE_ID)
;
--7
SELECT DEPARTMENT_NAME
FROM DEPARTMENTS
WHERE MANAGER_ID IS null
;
--8
SELECT e.FIRST_NAME AS "Employee", m.FIRST_NAME AS "Manager"
FROM EMPLOYEES e JOIN EMPLOYEES m
ON (e.MANAGER_ID = m.EMPLOYEE_ID)
;
--9
SELECT e.EMPLOYEE_ID, e.FIRST_NAME, e.LAST_NAME
FROM EMPLOYEES e
WHERE e.EMPLOYEE_ID NOT IN (SELECT NVL(MANAGER_ID,0) FROM EMPLOYEES)
ORDER BY 1
;
--10 the 2005 one but WITH the trunc() FUNCTION
-- to test the output format: SELECT trunc(hire_date, 'year') FROM EMPLOYEES;
SELECT e.FIRST_NAME
FROM EMPLOYEES e
WHERE TRUNC(e.HIRE_DATE, 'year') = 2005-01-01 00:00:00
;

--Exercises pag 46
--1
SELECT e.SALARY, e.SALARY*1.085 AS "+8,5%", e.SALARY*(1.085-1) AS DELTA
FROM EMPLOYEES e;
--2
--extra: the same if it begin with A or a with the regexp_like function
SELECT FIRST_NAME,last_name
FROM EMPLOYEES
WHERE REGEXP_LIKE(FIRST_NAME, '[Aa].*') OR REGEXP_LIKE (LAST_NAME, '[Aa].*')
ORDER BY 1;
--3
SELECT e.FIRST_NAME,MONTHS_BETWEEN(SYSDATE,e.HIRE_DATE)
FROM EMPLOYEES e
;
--4
SELECT e.FIRST_NAME, lpad('*', Floor(Salary/1000),'*') as Salary
FROM EMPLOYEES e
;
--5
SELECT FIRST_NAME,Last_name,NVL(TO_CHAR(e.COMMISSION_PCT),'no value')
FROM EMPLOYEES e
;

select department_id, trunc(avg(salary))
from employees
group by department_id
order by 1;

select manager_id, trunc(avg(salary))
from employees
where salary < 8000
group by manager_id
having avg(salary) > 6000
order by 2 desc;

select first_name, last_name from employees
where employee_id = (select manager_id from employees where last_name = 'Chen');

select department_id, trunc(avg(salary)) from employees
group by department_id having avg(salary) < (
select max(avg(salary)) from employees group by department_id);

select *
from (select * from employees where employee_id between 112 and 115);

select first_name, last_name
from employees
where employee_id NOT IN (select NVL(manager_id,0) from employees);

select region_name, country_count
from regions natural join (
select region_id, count(rowid) country_count
from countries
group by region_id);

select first_name, last_name from employees
where employee_id in(
select distinct manager_id
from employees where manager_id is not null)
order by 2;

--Esercizi pag 53
select MAX(salary) Max, MIN(salary) Min, SUM(salary) sum, round(AVG(salary)) avg  
from employees;

select job_id, MAX(salary) Max, MIN(salary) Min, SUM(salary) sum, round(AVG(salary)) avg  
from employees
group by job_id;

select job_id, COUNT(employee_id)
from employees
group by job_id;

select job_id, COUNT(employee_id)
from employees
where job_id='IT_PROG'
group by job_id;

select COUNT(DISTINCT(manager_id))
from employees;

select (MAX(salary)- MIN(salary)) as Difference
from employees;

select job_id, (MAX(salary)- MIN(salary)) as Difference
from employees
group by job_id
having (MAX(salary)- MIN(salary))>0;

select manager_id, MIN(salary)
from employees
where manager_id is not null
group by manager_id
HAVING MIN(salary) > 6000
order by 1;

select l.location_id, l.street_address, l.postal_code, l.city, l.state_province, c.country_name, c.country_name
from locations l join countries c 
using(country_id);

select e.first_name, e.last_name, d.department_name, 
from employees e join departments d
using(department_id);

select e.first_name, e.last_name, d.department_name, l.city
from employees e join departments d
using(department_id)
join locations l using(location_id)
where l.city= 'Toronto';

select first_name, last_name
from employees
where hire_date>(select hire_date from employees where last_name='Lee' and first_name='David');

select e.first_name, e.last_name 
from employees e join employees m
on (e.manager_id=m.employee_id) --self join
where(e.hire_date<m.hire_date); 

select first_name, last_name, manager_id
from employees
where manager_id=(select manager_id from employees where last_name='Ozer' and first_name='Lisa');

select first_name, last_name, manager_id
from employees
where 



