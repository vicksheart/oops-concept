class Throw
{
  static void agecal(int age)
 {
   if(age<18)
   throw new ArithmeticException("you are not applicable to vote");
   else
   System.out.println("you are applicable for vote");
}
public static void main(String ar[])
{
 agecal(20);
 System.out.println("iam final definatley i will execute");
}
}
