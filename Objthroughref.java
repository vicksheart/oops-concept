import java.io.*;
import java.util.*;
class Obj1
{
 String name;
 int age;
}

public class Objthroughref
{
 public static void main(String ar[])
{
 Obj1 na = new Obj1();
 Obj1 ag = new Obj1();
 na.name="manish";
 ag.age=12;
 System.out.println(na.name+""+ag.age);
}
}