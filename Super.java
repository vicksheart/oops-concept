class A1
{
 String name="manish";
}
class A2 extends A1
{
  String name="tiwari";
  void sup()
{
  System.out.println(name);
  System.out.println(super.name);
}
}
public class Super
{
 public static void main(String ar[])
{
 A2 o1 = new A2();
 o1.sup();
}
}
