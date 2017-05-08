import java.io.*;
import java.util.*;
class Test
{
  Test()
{
  System.out.println("m");
}
Test(int x)
{
 this();
 System.out.println(x);
}
}
public class Mtest
{
public static void main(String ar[])
{
 Test t1 = new Test(10);
  
}
}
  