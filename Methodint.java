import java.io.*;
import java.util.*;
public class Methodint
{
 public static void main(String ar[])
 {
  String actual;
  Scanner in = new Scanner(System.in);
  System.out.println("Enter who are you");
  actual=in.next();
  int result=whoareu(actual);
  System.out.println(result);
  }
public static int whoareu(String actual)
{
  if(actual.equals("adult"))
   return 30;
  else
   return 18;
}  
}