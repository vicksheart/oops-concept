import java.io.*;
import java.util.*;
class Obj
{
  String company;
  String name;
  int id;
Obj(String company,String name,int id)
{ 
 this.company=company;
 this.name=name;
 this.id=id;
}
void display()
{
 System.out.println(company+""+name+""+id);
}
}
public class Objthroughmethod
{
 public static void main(String ar[])
{
 Obj cc = new Obj("full creative","manish",101);
 Obj nn = new Obj("full creative","sangeetha",102);
 Obj ii = new Obj("full creative","aman",103);
cc.display();
nn.display();
ii.display();
}
}