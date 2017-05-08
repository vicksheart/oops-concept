public class Abb
{
 String name;
 int rollno;
 Address adr;
public Abb(String name,int rollno,Address adr)
{
 this.name=name;
 this.rollno=rollno;
 this.adr=adr;
}
void display()
{
  System.out.println("detaills of employee"+name+""+rollno);
  System.out.println("detaills of address is as follows"+""+adr.state+""+adr.city+""+adr.pincode);
}
public static void main(String ar[])
{
  Address adr1 = new Address("rajasthan","marwar junction",306001);
  Abb a1 = new Abb("maneesh tiwari",101,adr1);
  a1.display();
}
}