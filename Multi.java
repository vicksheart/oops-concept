class Animal
{
 void eat()
{
 System.out.println("eating");
}
}
class Dog
{
 void bark()
{
 System.out.println("bark");
}
}
class Multi extends Animal,Dog
{
 public static void main(String ar[])
{
puppy p1 = new puppy();
p1.eat();
p1.bark();
}
}