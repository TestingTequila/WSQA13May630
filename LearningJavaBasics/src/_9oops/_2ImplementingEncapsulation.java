package _9oops;

public class _2ImplementingEncapsulation {

	private int salary; 
	private String empName; 
	
	public void setSalary(int salary)
	{
		if(salary>1000 && salary<10000)
		{
			this.salary=salary;
			if(getEmpName().equals("Kerrie"))
			{
				this.salary=0;
			}
		}
		else
		{
			System.out.println(salary + " is an incorrect amount");
			this.salary=0;
			
		}
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String getEmpName()
	{
		
		return empName;
	}
	
	public String setEmpName(String empName)
	{
		if(empName.equals("Kerrie"))
		{
			System.out.println(empName + " is not an employee of this organization");
			this.empName="Kerrie";
		}
		else
		{
			this.empName=empName;
		}
		return empName;
	}
	
	public void payEmployeeThisSalary()
	{
		System.out.println("Pay employee " + getEmpName() + " a salary of " + getSalary() + "$");
	}
}
