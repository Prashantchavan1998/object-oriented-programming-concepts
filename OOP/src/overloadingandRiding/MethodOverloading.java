package overloadingandRiding;
class OverloadingEx
{
	void show(int a,int b)
	{
		System.out.println(a+b);
	}
	
}
public class MethodOverloading extends OverloadingEx
{
	void show(float c,float d)
	{
		System.out.println(c+d);
	}

	public static void main(String[] args) 
	{
		MethodOverloading ab=new MethodOverloading();
		ab.show(10, 20);
		ab.show(10.1f,12.2f);
		
		
	}

}
