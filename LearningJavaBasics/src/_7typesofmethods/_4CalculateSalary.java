package _7typesofmethods;

public class _4CalculateSalary {

	// Whatever be the salary of an employee, we will offer 1000$ as covid vaccination
	// BasicSalary and TravelAllowance
	
	public double calculateEmpSalary(double basicSalary, double travelAllowance)
	{
		double empSalary=basicSalary+travelAllowance;	
		System.out.println("The salary of employee is :" + empSalary);
		return empSalary;
	}
}
