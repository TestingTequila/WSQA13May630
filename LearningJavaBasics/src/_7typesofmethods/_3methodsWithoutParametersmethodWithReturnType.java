package _7typesofmethods;

public class _3methodsWithoutParametersmethodWithReturnType {

	//methodsWithoutParameters()+methodWithReturnType(void)
	
	// Whatever be the sum or difference of two integer numbers, i will multiply the result with 5;
	int a;
	int b;
	
	public void addition1()
	{
		int sum = a+b;
		System.out.println("Addition1 without returnType[void] = " + sum);
	}
	
	public int addition2()
	{
		int sum = a+b;
		System.out.println("Addition2 with return type[int] = " + sum);
		return sum;
	}
	

	
	
}
