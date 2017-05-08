class Animal
{
 void eat()
{
 System.out.println("eating");
}
}
class Dog extends Animal
{
 void barks()
{
 System.out.println("dog barks");
}
} 
class puppy extends Dog
{
 void sound()
{
 System.out.println("kukukukuku");
}
}
class Multih
{
 public static void main(String ar[])
{
 Animal a1 = new Animal();
 Dog d1 = new Dog();
 puppy p1 = new puppy();
 p1.eat();
 p1.barks();
 p1.sound();
}
}