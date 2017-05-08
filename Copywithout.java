import java.util.*;
import java.io.*;
class Copywithout
{
  String name;
  int age;
  int id;
 Copywithout(String n,int a,int i)
{
 name=n;
 age=a;
 id=i;
}
Copywithout()
{
}
void display()
{
 System.out.println("Data are as follows"+name+age+id);
}
public static void main(String ar[])
{
 Copywithout cow = new Copywithout("maneesh",23,101);
 Copywithout cow1 = new Copywithout();
 cow1.name=cow.name;
 cow1.age=cow.age;
 cow1.id=cow.id;
 cow.display();
 cow1.display();
}
} 