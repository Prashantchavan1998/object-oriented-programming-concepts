package polymorphism;

public class CompileTime //method overloading, early binding, static polymorphism
{
	void add(int a, int b)
	{
		System.out.println("Addition of two numbers:"+(a+b));
	}
	void add(int a, int b, int c)
	{
		System.out.println("Addition of three number is:"+(a+b+c));
	}
	void sub(int c, int d)
	{
		System.out.println("Substraction of two values:"+(c-d));
	}
	void sub(int a, int b, int c)
	{
		System.out.println("Substraction of three values:"+(a-b-c));
	}
	void mul(int f,int g)
	{
		System.out.println("Multiplication of two number is:"+(f*g));
	}
	void mul(int a, int b, int c)
	{
		System.out.println("Multiplication of three number is:"+(a*b*c));
	}
	public static void main(String[] args) 
	{
		CompileTime ab=new CompileTime();
		ab.add(10, 20);
		ab.add(20, 45,5);
		ab.sub(10, 45);
		ab.sub(10, 45,41);
		ab.mul(10, 3);
		ab.mul(12, 45,21);

	}

}
