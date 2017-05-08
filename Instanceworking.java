import java.io.*;
import java.util.*;
class Instanceworking
{
  int one=1;
  int two=2;
  int three=3;
  int four=4;
  int six=6;
public int runcalc()
{
  return one*two*three*four*six;
}
public static void main(String ar[])
{
  Instanceworking oo = new Instanceworking();
  int result = oo.runcalc();
  System.out.println(result);
}
}
