package encapsulation;
class Encap
{
	private int a,b;

	public int getA() 
	{
		return a;
	}

	public void setA(int a) 
	{
		this.a = a;
	}

	public int getB() 
	{
		return b;
	}

	public void setB(int b) 
	{
		this.b = b;
	}

	
}

public class Encapsulation 
{
	

	public static void main(String[] args) 
	{
		Encap ab=new Encap();
		ab.setA(10);
		ab.setB(25);
		System.out.println(ab.getA()+ab.getB());
		

	}

}
