class Animal
{
  void dog()
{
 System.out.println("barks");
}
}
class Fox extends Animal
{
 void eat()
{
 System.out.println("eating");
}
}
class H1
{
 public static void main(String ar[])
{
 Animal a1 = new Animal();
 Fox f1 = new Fox();
f1.eat();
 f1.dog();
}
}