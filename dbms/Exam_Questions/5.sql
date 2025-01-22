declare
   side1 number;
   side2 number;
   side3 number;
begin
   side1 := &side1;
   side2 := &side2;
   side3 := &side3;
   case
      when
         side1 = side2
         and side3 = 0
      then
         dbms_output.put_line('fiqure is square.');
      when
         side1 <> side2
         and side3 = 0
      then
         dbms_output.put_line('fiqure is rectangle.');
      when side3 <> 0 then
         dbms_output.put_line('fiqure is triangle.');
   end case;
end;
/