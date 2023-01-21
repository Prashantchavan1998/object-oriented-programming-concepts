package abstraction;

abstract class Animals
{
	abstract void eat();
	
	Animals()
	{
		System.out.println("All animals");
	}
}
class Dog extends Animals
{
//	Dog()
//	{
//		super();
//	}
	void eat()
	{
		System.out.println("dog is eating roti");
	}
}
class Tiger extends Animals
{
	void eat()
	{
		System.out.println("Tiger is eating chicken");
	}
}
public class AbstractionExample 
{

	public static void main(String[] args) 
	{
		
		Tiger t=new Tiger();
		Dog d=new Dog();
		t.eat();
		d.eat();

	}

}
