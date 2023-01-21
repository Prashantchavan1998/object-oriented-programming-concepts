package polymorphism;
import java.util.Scanner;
public class CompileSca 
{
	void show(int a, int b)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a+b);
		
	}
	void show(int a,int b,int c)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println(a+b+c);
	}

	public static void main(String[] args) 
	{
		CompileSca ab=new CompileSca();
		ab.show(0,0);
		ab.show(0,0,0);
	}

}
