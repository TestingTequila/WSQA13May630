package _12Oops_Inheritance_Interface;

public class D implements Base{
	
	@Override
	public void addition(int a, int b) {

           System.out.println((6*a+b));
		
	}

	@Override
	public void subtraction(int a, int b) {
		System.out.println(6*a-b);
		
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(6*a*b);
		
	}

	@Override
	public void division(int a, int b) {
		System.out.println(4*a/b);
		
	}

}
