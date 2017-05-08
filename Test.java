import java.io.*;
import java.util.*;
class Test
{
  void m1()
{
 System.out.println("m1")
}
void m2();
{
 this.m1();
 System.out.println("m2")
}
}
class Mtest
{
 public static void main(String ar[])
{
 Test t1=new Test();
 t1.m1();
 t1.m2();
}
}
