import java.io.*;
import java.util.*;
class Tiwari
{
 public static void main(String ar[])
{
 Scanner in = new Scanner(System.in);
 String r;
 System.out.println("Enter the string to be reversed");
 r=in.next();
 String rev="";
 Char ch = r.toCharArray();
 for(int i=r.length()-1;i>0;i--)
{
  rev=ch[i]+rev;
}
System.out.println(rev);
}
}