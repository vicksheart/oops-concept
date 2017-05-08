import java.io.*;
import java.util.*;
class Test
{
  int rollno;
  String name;
  int id;
 Test(int rollno,String name)
{
  this.rollno=rollno;
  this.name=name;
}
Test(int rollno,String name,int id)
{
 this(rollno,name);
 this.id=id;
}
void display()
{
 System.out.println("Detaills of the data is"+rollno+""+name+""+id);
}
}
public class Constchain
{
 public static void main(String ar[])
{
  Test t1 = new Test(101,"maneesh");
  Test t2 = new Test(102,"tiwari",400);
  t1.display();
  t2.display();
}
}