import java.io.*;
import java.util.*;
class Test
{
 Test()
{
 this(5);
 System.out.println("hello");
}
Test(int x)
{
 System.out.println(x);
 }
}
public class This3
{
 public static void main(String ar[])
{
 Test t1 = new Test();
}
}