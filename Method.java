import java.io.*;
import java.util.*;
class Method
{
  public static void main(String arr[])
{
  int age;
  Scanner in = new Scanner(System.in);
  System.out.println("Enter your age");
  age=in.nextInt();
  String result = agecalculator(age);
  System.out.println(result);
}
public static String agecalculator(int age)
  {
   if(age>18)
   {
   return "adult";
   }
   else
   {
   return "minor";
   }
}
}