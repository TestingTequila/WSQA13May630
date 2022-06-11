package _12Oops_Inheritance_Interface;

public class A implements Base{

	@Override
	public void addition(int a, int b) {

           System.out.println((a+b));
		
	}

	@Override
	public void subtraction(int a, int b) {
		System.out.println(a-b);
		
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(a*b);
		
	}

	@Override
	public void division(int a, int b) {
		System.out.println(a/b);
		
	}

	
}
