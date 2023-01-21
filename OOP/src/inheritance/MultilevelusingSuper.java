package inheritance;
class MultiL
{
	void show()
	{
		System.out.println(10*2);
	}
	
}
class MultiL1 extends MultiL
{
	void show()
	{
		System.out.println(10+2);
		super.show();
	}
	
}

public class MultilevelusingSuper extends MultiL1
{
	void show()
	{
		System.out.println(10-2);
		super.show();
	}

	public static void main(String[] args) 
	{
		MultilevelusingSuper ab=new MultilevelusingSuper();
		ab.show();
		

	}

}
