import java.io.*;
import java.util.*;
class Bank
{
 int acno;
 String name;
 int amount;
 void insert(int ac,String n,int a)
{
 acno=ac;
 name=n;
 amount=a;
}
void deposit(int amt)
{
  amount=amt+amount;
}
void withdraw(int amt)
{
 if(amt>amount)
{
System.out.println("insufficent fund boss");
} 
else
{
 amount=amount-amt;
 System.out.println("your withdrwn balance is"+amount);
}
}
void checkbal()
{
  System.out.println("your current balance is"+amount);
}
void display()
{
 System.out.println("detaills of the employees are as follows"+acno+name+amount);
}
}
public class Bankproject
{
 public static void  main(String ar[])
{
 Bank b1=new Bank();
 b1.insert(101,"Manish",5000);
 b1.deposit(4000);
 b1.display();
 b1.withdraw(2000);
 b1.display();
 b1.checkbal();
 b1.display();
}
}
