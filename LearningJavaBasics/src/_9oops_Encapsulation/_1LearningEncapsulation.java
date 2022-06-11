package _9oops_Encapsulation;

public class _1LearningEncapsulation {
	
	private int a;
	private int b;
	
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public void addition()
	{
		int sum = getA()+ getB();
		System.out.println("Addition = " +sum);
	}

}
