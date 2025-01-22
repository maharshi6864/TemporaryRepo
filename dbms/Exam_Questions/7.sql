begin
   for i in 1..7 loop
      for j in 1..i loop
         dbms_output.put('1');
      end loop;
      dbms_output.put_line('');
   end loop;
end;
/