import java.io.*;
import java.util.*;
public class Arrdup
{
 public static void main(String a[])
{
Scanner in = new Scanner(System.in);
int i,j,n;
int a_count=0;
System.out.println("enter number of elments");
n=in.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
   arr[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
  for(j=i+1;j<n;j++)
   {
      if(arr[i]==arr[j]) 
            {
                 a_count++;
            }
    }
}
if(a_count>1)
{
  System.out.println("number of non duplicate values are"+a_count);
}
}
}