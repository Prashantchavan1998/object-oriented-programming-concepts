package inheritance;
class Superkey
{
	int a=10, b=30;
	void Cal()
	{
		System.out.println(a+b);
		
	}
}

public class SingleUsingSuperKey extends Superkey
{
	void Cal()
	{
		System.out.println(a*b);
		super.Cal();
	}

	public static void main(String[] args) 
	{
		
		SingleUsingSuperKey ab=new SingleUsingSuperKey();
		ab.Cal();
	}

}
