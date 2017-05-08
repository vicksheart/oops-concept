import java.util.*;
import java.io.*;
class Object
{
	static int cal=1;
  static void Cal(int n)
  {
   
   for(int i=1;i<=n;i++)
    {
       cal=cal*i;
    }
   }
  static void  display()
 {
  System.out.println(cal);
 }
}
public class Rr
{
 public static void main(String ar[])
{
 new Object().Cal(5);
 Object.display();
}
}
