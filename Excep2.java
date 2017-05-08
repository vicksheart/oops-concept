import java.io.*;
import java.util.*;
class Excep2
{
  void manish() throws IOException
{
  throw new IOException("not valid");
}
public static void main(String ar[])
{
  try
{
  Excep2 ex = new Excep2();
  ex.manish();
}
catch(IOException e)
{
 System.out.println("at last");
}
System.out.println("asdfadsf");
}
}  