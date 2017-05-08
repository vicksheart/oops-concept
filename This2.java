import java.io.*;
import java.util.*;
class Obj
{
 void method1()
 {
  System.out.println("heyee iam methood1");
 }
void method2()
{
  System.out.println("heyee this is method 2");
  this.method1();
}
}
public class This2
{
public static void main(String ar[])
{
 Obj o1 = new Obj();
 o1.method1();
 o1.method2();
}
}