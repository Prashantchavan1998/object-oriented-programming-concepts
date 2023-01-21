package inheritance;

class Single
{
	int a=10;
	int b=20;
	void add()
	{
		System.out.println(a+b);
	}
}

public class SingleInheritance extends Single
{
	void multiple()
	{
	System.out.println(a*b);
	
	}
	public static void main(String[] args) 
	{
		SingleInheritance a=new SingleInheritance();
		a.add();
		a.multiple();

	}

}
