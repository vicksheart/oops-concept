import java.io.*;
import java.util.*;
public class Insertionsort
{
 public static void main(String ar[])
{
 int i,j,n=5;
 Scanner in = new Scanner(System.in);
 System.out.println("Enter the number of elements");
 n = in.nextInt();
 int arr[]=new int[n];
 for(i=0;i<n;i++)
{
  arr[i]=in.nextInt();
}
      for(i=0;i<n;i++)
          {
               for(j=i+1;j<n;j++)
                      {
                           if(arr[i]>arr[j])
                                 {
                                       int swap;
                                       swap=arr[i]; 
                                       arr[i]=arr[j];
                                       arr[j]=swap;
                                 }
                       }
          }
System.out.println("Value after sorting ascending order is as follows");
for(i=0;i<n;i++)
{
 System.out.println(arr[i]);
}
}
}    
