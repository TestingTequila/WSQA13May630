package _7typesofmethods;

public class _2methodsWithParametersmethodsWithoutReturnType {

	//methodsWithParameters(variablesInside)+methodsWithoutReturnType(void)
	
	// WAP to calculate and print salary of a person 
	

	
	public void calaculateSalary(int basicSalary,int travelAllowance )
	{
		int monthlySalary=basicSalary+ travelAllowance;
		System.out.println("The salary credited is : " + monthlySalary + "$");
	}
	
	public void calaculateTax()
	{
		int tax =500;
		System.out.println("Tax deduction amount is " + tax + "$");
	}
	
	
}
