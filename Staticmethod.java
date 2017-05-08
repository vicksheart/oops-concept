import java.io.*;
import java.util.*;
class Staticmethod
{
 int rollno;
 String name;
 static String college="vit university";
 static void method()
 {
  college="subodh pg college";
 }
 Staticmethod(int r,String n)
{
 rollno=r;
 name=n;
}
void display()
{
 System.out.println("the work of static method is as follows"+rollno+""+name+""+college);
}
public static void main(String ar[])
{
 Staticmethod.method();
 Staticmethod s1 = new Staticmethod(101,"Manish");
 s1.display();
}
}