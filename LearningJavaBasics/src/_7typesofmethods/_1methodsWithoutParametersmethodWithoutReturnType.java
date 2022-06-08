package _7typesofmethods;

public class _1methodsWithoutParametersmethodWithoutReturnType {
	
	// WAP to perform addition, subtraction, multiplication and division 
	// of two integer numbers.
	     //1. methodsWithoutParameters()+methodWithoutReturnType(void)
	     // If you want to share your variable with multiple methods of the 
	     // same class - Make those variable/s as Global Variable[Outside the method variable/s]
	
	int a;
	int b;
	
	
	public void addition()
	{
		int sum =a+b;
		System.out.println("The sum of numbers is " + sum);
	}
	
	public void subtraction()
	{
		int diff=a-b;
		System.out.println("The difference of numbers is " + diff);
	}
	
	public void multiplication()
	{
		int product=a*b;
		System.out.println("The product of numbers is " + product);
	}
	
	public void division()
	{
		int div=a/b;
		System.out.println("The division of numbers is " + div);
	}
	

}
