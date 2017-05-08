import java.io.*;
import java.util.*;
class Copyconst
{
 String name;
 int age;
 String colg;
 Copyconst(String n,int a,String c)
{
 name=n;
 age=a;
 colg=c;
}
Copyconst(Copyconst c1)
{
name=c1.name;
age = c1.age;
colg=c1.colg;
}
void display()
{
 System.out.println(name+age+colg);
}
public static void main(String ar[])
{
 Copyconst c2 = new Copyconst("manish",22,"vit");
 Copyconst c3 = new Copyconst(c2);
 c2.display();
 c3.display();
}
}