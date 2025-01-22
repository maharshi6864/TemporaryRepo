declare
   ran number;
begin
   ran := &ran;
   for i in 1..ran loop
      if mod(
         i,
         2
      ) = 1 then
         dbms_output.put_line(i);
      end if;
   end loop;

end;
/