package _13polymorphism;

public class _1LearningOverloading {

	public void addition(int a, int b)
	{
		System.out.println((a+b));
	}
	
	public void addition(int a, double b)
	{
		System.out.println((a+b));
	}
	
	public void addition(double a, double b)
	{
		System.out.println((a+b));
	}
	
	public void addition(double a, double b, int c)
	{
	    System.out.println(a+b);
	}
}
