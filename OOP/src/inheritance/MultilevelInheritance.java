package inheritance;
class MultilevelEx
{
	void show()
	{
		System.out.println(10+20);
	}
}
class MultilevelEx1 extends MultilevelEx
{
	void Multi()
	{
		System.out.println(10*20);
	}
}
public class MultilevelInheritance extends MultilevelEx1
{
	void sub()
	{
		System.out.println(10-20);
		
	}

	public static void main(String[] args) 
	{
		MultilevelInheritance ab=new MultilevelInheritance();
		ab.show();
		ab.sub();
		ab.Multi();
		

	}

}
