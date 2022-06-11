package _12Oops_Inheritance_Interface;

public class B implements Base{

	@Override
	public void addition(int a, int b) {

           System.out.println((2*a+ 2*b));
		
	}

	@Override
	public void subtraction(int a, int b) {
		System.out.println(2*a-2*b);
		
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(3*a*b);
		
	}

	@Override
	public void division(int a, int b) {
		System.out.println(4*a/b);
		
	}

}
