declare
   aa number;
   bb number;
begin
   aa := &aa;
   bb := &bb;
   dbms_output.put_line('sum of a and b is : ' || (aa + bb));
   dbms_output.put_line('product of a and b is : ' || (aa * bb));
   dbms_output.put_line('power of a and b is : ' || power(aa , bb));
end;