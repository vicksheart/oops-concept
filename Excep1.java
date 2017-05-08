import java.io.*;
import java.util.*;
public class Excep1
{
 public static void main(String ar[])
{
 try
{ 
 int arr[] = new int[5];
 arr[5]=30;
}
catch(ArrayIndexOutOfBoundsException e)
{
 System.out.println(e);
}
try
{
 int arr=30/0;
}
catch(ArithmeticException e)
{
 System.out.println(e);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("sdfdf");
}
}