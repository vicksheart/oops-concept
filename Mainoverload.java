public class Mainoverload
{
 public static void main(String ar[])
  {
	main(6);
	main();
    System.out.println("String ar[]");
  }
public static void main(String ar)
{
  System.out.println("String ar");
}
public static  void main()
{
  System.out.println("helo");
}
}