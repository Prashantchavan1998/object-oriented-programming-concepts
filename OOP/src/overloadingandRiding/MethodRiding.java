package overloadingandRiding;
class MethodoverRiding
{
	void show(int a, int b)
	{
		System.out.println(a+b);
	}
}

public class MethodRiding extends MethodoverRiding
{
	void show(int a, int b)
	{
		System.out.println(a*b);
		super.show(a, b);
	}

	public static void main(String[] args) 
	{
		
		MethodRiding ab=new MethodRiding();
		ab.show(20, 30);
	}

}
