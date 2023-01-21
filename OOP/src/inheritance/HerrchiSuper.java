package inheritance;
class Super
{
	void add()
	{
		System.out.println(25+10);
	}
}
class SuperHerar extends Super
{
	void add()
	{
		System.out.println(25+30);
		
	}
}

public class HerrchiSuper extends Super
{
	void add()
	{
		System.out.println(50+30);
		super.add();
	}

	public static void main(String[] args) 
	{
		HerrchiSuper ab=new HerrchiSuper();
		ab.add();
		SuperHerar pc=new SuperHerar();
		pc.add();

	}

}
