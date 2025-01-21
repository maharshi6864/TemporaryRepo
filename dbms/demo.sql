begin
   -- Create table
  --  execute immediate 'CREATE TABLE employee (
  --     emp_id INT PRIMARY KEY, 
  --     emp_name VARCHAR(15), 
  --     city VARCHAR(15), 
  --     emp_phn VARCHAR(10), 
  --     emp_sal NUMBER(8,2)
  --  )';

   -- Insert data into the table
   execute immediate 'INSERT INTO employee (emp_id, emp_name, city, emp_phn, emp_sal) 
                      VALUES (106, ''SUJAL'', ''surat'', ''8596748596'', 2345.12)';
   execute immediate 'INSERT INTO employee (emp_id, emp_name, city, emp_phn, emp_sal) 
                      VALUES (102, ''Aarsh'', ''ahemdabad'', ''906748596'', 2345.12)';
   execute immediate 'INSERT INTO employee (emp_id, emp_name, city, emp_phn, emp_sal) 
                      VALUES (103, ''Aastha'', ''ahemdabad'', ''2396748596'', 2345.12)';
   execute immediate 'INSERT INTO employee (emp_id, emp_name, city, emp_phn, emp_sal) 
                      VALUES (104, ''Raj'', ''rajkot'', ''8596742396'', 2345.12)';
end;
/


declare
   v_emp_id employee.emp_id%type;
   v_sal    employee.emp_sal%type;
begin
  v_emp_id:=&employee_id;

   select emp_sal
     into v_sal
     from employee
    where emp_id = v_emp_id;

   if v_sal < 2600 then
      update employee
         set
         emp_sal = emp_sal + ( emp_sal * 0.10 )
       where emp_id = v_emp_id;
      dbms_output.put_line('Salary of employee id ' || v_emp_id);
   else
      dbms_output.put_line('Salary is not greater than 2600 !!' || v_emp_id);
   end if;

end;
/