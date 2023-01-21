package inheritance;

class Herar
{
	void sub()
	{
		System.out.println(50-32);
	}
}

class Herarchi extends Herar
{
	void add()
	{
		System.out.println(50+23);
	}
}

public class Herarchical extends Herar
{
	void Multi()
	{
		System.out.println(2*5);
	}

	public static void main(String[] args)
	{
		Herarchical ab=new Herarchical();
		ab.Multi();
		ab.sub();
		Herarchi pc=new Herarchi();
		pc.add();

	}

}
