import java.io.*;
class Manishthrows
{
  void profit() throws IOException
 {
  throw new IOException("not this time dude");
 }
 void profit1() throws IOException
{
  profit();
}
void profit3()
{
 try
{
  profit1();
}
catch(Exception e)
{
System.out.println("Yes at last you done it");
}
System.out.println("Iam again here");
}
public static void main(String ar[])
{
 Manishthrows man = new Manishthrows();
 man.profit3();
}
}
