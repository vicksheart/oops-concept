import java.io.*;
import java.util.*;
class Obj
{
 String name;
 int age;
 Obj(String name,int age)
{
 this.name=name;
 this.age=age;
}
void display()
{
 System.out.println(name+age);
}
}
public class This
{
  public static void main(String ar[])
{
 Obj o1 = new Obj("manish",20);
 o1.display();
}
}