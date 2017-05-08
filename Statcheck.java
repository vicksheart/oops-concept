import java.io.*;
import java.util.*;
class Statcheck
{
 static int count=0;
 Statcheck()
{
 count++;
 System.out.println(count);
}
public static void main(String ar[])
{
Statcheck s1 = new Statcheck();
Statcheck s2 = new Statcheck();
Statcheck s3 = new Statcheck();
}
}