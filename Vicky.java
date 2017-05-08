import java.io.*;
import java.util.*;
public class Vicky
{
 int number;
 String manish;
 int age;
 Vicky(int n,String ma)
{
 number=n;
 manish=ma;
}
 Vicky(int n,String ma,int ag)
{
 number=n;
 manish=ma;
 age=ag;
}
void display()
{
 System.out.println(number+manish+age);
}
public static void main(String ar[])
{
 Vicky v1=new Vicky(101,"tiwari");
 Vicky v2=new Vicky(102,"vicks",23);
 v1.display();
 v2.display();
}
}