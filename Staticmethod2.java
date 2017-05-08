import java.io.*;
import java.util.*;
class Staticmethod2
{
 static int cube(int x)
{
  return x*x*x;
}
public static void main(String ar[])
{
 int result=Staticmethod2.cube(5);
 System.out.println(result);
}
}
 