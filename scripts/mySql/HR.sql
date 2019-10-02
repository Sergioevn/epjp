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

SELECT region_name 
FROM regions 
WHERE region_id = 1;

SELECT country_name
FROM countries 
WHERE region_id = 1;

SELECT country_name, region_name
FROM regions, countries
WHERE regions.region_id = countries.region_id;

SELECT R.region_name, C.country_name
FROM regions R, countries C
WHERE R.region_id = C.region_id;

SELECT country_name, region_name
FROM regions JOIN countries -- join è “inner” per default
USING(region_id)
ORDER BY 1;

SELECT country_name, region_name 
FROM regions NATURAL JOIN countries
ORDER BY 1;

SELECT region_name, country_name
FROM regions R JOIN countries C
ON(R.region_id = C.region_id);

SELECT E.last_name AS employee, M.last_name AS MANAGER
FROM employees E JOIN employees M
ON (E.manager_id = M.employee_id)
ORDER BY 1;

-----Back to the lesson-----
SELECT country_name, region_name
FROM countries, regions
WHERE regions.region_id = countries.region_id AND countries.region_id = 2
ORDER BY country_name
;
SELECT country_name, region_name
FROM regions JOIN countries
USING (region_id)
ORDER BY 1
;
SELECT region_name, country_name
FROM regions, countries
;
SELECT employee_id, first_name, last_name, city, department_name
FROM employees JOIN departments USING(department_id) JOIN locations USING(location_id)
;
SELECT E.last_name, E.salary, j.min_salary
FROM employees E JOIN jobs j
ON(E.salary BETWEEN j.min_salary AND j.min_salary + 100)
WHERE(E.job_id = j.job_id)
;
SELECT first_name, last_name, department_id, department_name
FROM employees RIGHT OUTER JOIN departments
USING(department_id)
WHERE department_id BETWEEN 110 AND 120
;
SELECT E.last_name, D.department_name
FROM employees E FULL OUTER JOIN departments D
ON (E.department_id = D.department_id)
WHERE last_name = 'Grant'
OR D.department_id BETWEEN 110 AND 120
;
-----Exercises-----
--1
SELECT first_name, last_name, department_name
FROM employees JOIN departments
USING(department_id)
;
--2
SELECT first_name, last_name, job_title
FROM employees JOIN jobs
USING (job_id)
;
--3
SELECT first_name, last_name, salary
FROM employees E JOIN jobs j
USING (job_id)
WHERE E.salary = j.min_salary OR E.salary = j.max_salary
;
--4
SELECT first_name, last_name, L.country_id
FROM employees E JOIN departments D USING (department_id)
JOIN locations L USING (location_id)
WHERE L.country_id = 'UK'
;
--5
SELECT department_name, first_name
FROM departments D LEFT OUTER JOIN employees E ON (D.manager_id=E.employee_id)
;
--6
SELECT department_name, first_name
FROM departments D JOIN employees E ON (D.manager_id=E.employee_id)
;
--7
SELECT department_name
FROM departments
WHERE manager_id IS NULL
;
--8
SELECT E.first_name AS "Employee", M.first_name AS "Manager"
FROM employees E JOIN employees M
ON (E.manager_id = M.employee_id)
;
--9
SELECT E.employee_id, E.first_name, E.last_name
FROM employees E
WHERE E.employee_id NOT IN (SELECT nvl(manager_id,0) FROM employees)
ORDER BY 1
;
--10 the 2005 one but WITH the trunc() FUNCTION
-- to test the output format: SELECT trunc(hire_date, 'year') FROM EMPLOYEES;
SELECT E.first_name
FROM employees E
WHERE TRUNC(E.hire_date, 'year') = 2005-01-01 00:00:00
;

--Exercises pag 46
--1
SELECT E.salary, E.salary*1.085 AS "+8,5%", E.salary*(1.085-1) AS delta
FROM employees E;
--2
--extra: the same if it begin with A or a with the regexp_like function
SELECT first_name,last_name
FROM employees
WHERE REGEXP_LIKE(first_name, '[Aa].*') OR REGEXP_LIKE (last_name, '[Aa].*')
ORDER BY 1;
--3
SELECT E.first_name,months_between(sysdate,E.hire_date)
FROM employees E
;
--4
SELECT E.first_name, lpad('*', floor(salary/1000),'*') AS salary
FROM employees E
;
--5
SELECT first_name,last_name,nvl(to_char(E.commission_pct),'no value')
FROM employees E
;

SELECT department_id, TRUNC(AVG(salary))
FROM employees
GROUP BY department_id
ORDER BY 1;

SELECT manager_id, TRUNC(AVG(salary))
FROM employees
WHERE salary < 8000
GROUP BY manager_id
HAVING AVG(salary) > 6000
ORDER BY 2 DESC;

SELECT first_name, last_name FROM employees
WHERE employee_id = (SELECT manager_id FROM employees WHERE last_name = 'Chen');

SELECT department_id, TRUNC(AVG(salary)) FROM employees
GROUP BY department_id HAVING AVG(salary) < (
SELECT MAX(AVG(salary)) FROM employees GROUP BY department_id);

SELECT *
FROM (SELECT * FROM employees WHERE employee_id BETWEEN 112 AND 115);

SELECT first_name, last_name
FROM employees
WHERE employee_id NOT IN (SELECT nvl(manager_id,0) FROM employees);

SELECT region_name, country_count
FROM regions NATURAL JOIN (
SELECT region_id, COUNT(ROWID) country_count
FROM countries
GROUP BY region_id);

SELECT first_name, last_name FROM employees
WHERE employee_id IN(
SELECT DISTINCT manager_id
FROM employees WHERE manager_id IS NOT NULL)
ORDER BY 2;





--Esercizi pag 53
SELECT MAX(salary) MAX, MIN(salary) MIN, SUM(salary) SUM, round(AVG(salary)) AVG  
FROM employees;

SELECT job_id, MAX(salary) MAX, MIN(salary) MIN, SUM(salary) SUM, round(AVG(salary)) AVG  
FROM employees
GROUP BY job_id;

SELECT job_id, COUNT(employee_id)
FROM employees
GROUP BY job_id;

SELECT job_id, COUNT(employee_id)
FROM employees
WHERE job_id='IT_PROG'
GROUP BY job_id;

SELECT COUNT(DISTINCT(manager_id))
FROM employees;

SELECT (MAX(salary)- MIN(salary)) AS difference
FROM employees;

SELECT job_id, (MAX(salary)- MIN(salary)) AS difference
FROM employees
GROUP BY job_id
HAVING (MAX(salary)- MIN(salary))>0;

SELECT manager_id, MIN(salary)
FROM employees
WHERE manager_id IS NOT NULL
GROUP BY manager_id
HAVING MIN(salary) > 6000
ORDER BY 1;

SELECT L.location_id, L.street_address, L.postal_code, L.city, L.state_province, C.country_name, C.country_name
FROM locations L JOIN countries C 
USING(country_id);

SELECT E.first_name, E.last_name, D.department_name, 
FROM employees E JOIN departments D
USING(department_id);

SELECT E.first_name, E.last_name, D.department_name, L.city
FROM employees E JOIN departments D
USING(department_id)
JOIN locations L USING(location_id)
WHERE L.city= 'Toronto';

SELECT first_name, last_name
FROM employees
WHERE hire_date>(SELECT hire_date FROM employees WHERE last_name='Lee' AND first_name='David');

SELECT E.first_name, E.last_name 
FROM employees E JOIN employees M
ON (E.manager_id=M.employee_id) --self join
WHERE(E.hire_date<M.hire_date); 

SELECT first_name, last_name, manager_id
FROM employees
WHERE manager_id=(SELECT manager_id FROM employees WHERE last_name='Ozer' AND first_name='Lisa');

SELECT E.first_name, E.last_name, E.department_id
FROM employees E 
WHERE department_id IN (SELECT DISTINCT department_id
FROM employees
WHERE UPPER(last_name) LIKE '%U%');

select e.first_name, e.last_name, d.department_name
from employees e join departments d
using (department_id)
where d.department_name= 'Shipping';

select first_name, last_name, manager_id
from employees 
where manager_id in
(select employee_id 
from employees
where first_name='Steven' and last_name='King');

select e.last_name as Surname,e.first_name as Name, m.first_name || ' ' || m.last_name as Manager
from employees e join employees m
on (e.manager_id=m.employee_id)
where m.first_name='Steven' and m.last_name='King'
order by 1;

update regions
set region_name = 'Region ' || region_id
where region_id > 10;

delete from regions
where region_id > 10;

insert into regions(region_id, region_name)
values (1, 'Antarctica');


create or replace view phone_view as
select * from employees
where mod(coder_id, 2) = 1
with read only;
drop view phone_view;

