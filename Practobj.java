import java.io.*;
import java.util.*;
class Bank
{
 int acno;
 String name;
 int amount;
void insert(int a,String n,int amt)
{
  acno=a;
 name=n;
 amount=amt;
}
void deposit(int amt)
{
  amount=amt+amount;
}
void withdrawn(int amt)
{
 if(amount<amt)
{
 System.out.println("insufficent funds");
}
else
amount=amount-amt;
}
void checkbal()
{
 System.out.println("your balance is"+amount);
}
void display()
{
  System.out.println(acno+name+amount);
}
}
public class Practobj
{
 public static void main(String ar[])
{
 Bank b1=new Bank();
 b1.insert(101,"maneesh",8000);
 b1.display();
 b1.deposit(1000);
 b1.display();
 b1.withdrawn(8000);
 b1.display();
 b1.checkbal();
}
}