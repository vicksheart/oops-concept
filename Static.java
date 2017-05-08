import java.io.*;
import java.util.*;
class Static 
{
 int rollno=123;
 String name="manish";
 static String college="vit university";
 Static()
{

}
void display()
{
System.out.println("Detaills are as follows"+rollno+""+name+""+college);
}
}
class State
{
public static void main(String ar[])
{
 Static s1=new Static(); 
 System.out.println(s1.name);
 System.out.println(s1.college);
}
}