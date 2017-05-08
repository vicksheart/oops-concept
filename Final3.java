final class Bike
{
  void run()
{
 System.out.println("go");
}  
  }
class Final3 extends Bike
{  
  void run()
{
System.out.println("running safely with 100kmph");
}  
  public static void main(String args[]){  
  Final3 honda= new Final3();  
  honda.run();  
  }  
}  