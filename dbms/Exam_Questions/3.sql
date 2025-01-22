declare
   mark1    number;
   mark2    number;
   mark3    number;
   mark4    number;
   mark5    number;
   totals   number;
   percenta double precision;
begin
   mark1 := &marks1;
   mark2 := &marks2;
   mark3 := &marks3;
   mark4 := &marks4;
   mark5 := &marks5;
   totals := mark1 + mark2 + mark3 + mark4 + mark5;
   percenta := totals / 500 * 100;
   dbms_output.put_line('percentage is  : ' || percenta);
end;
/