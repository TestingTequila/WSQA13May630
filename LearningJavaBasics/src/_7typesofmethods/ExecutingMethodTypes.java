package _7typesofmethods;

public class ExecutingMethodTypes {

	public static void main(String[] args) {

		/*_1methodsWithoutParametersmethodWithoutReturnType mwpmwr= new _1methodsWithoutParametersmethodWithoutReturnType();
		mwpmwr.a=12;
		mwpmwr.b=4;
		
		mwpmwr.addition();
		mwpmwr.subtraction();
		mwpmwr.multiplication();
		mwpmwr.division();*/
		
		/*_2methodsWithParametersmethodsWithoutReturnType mwpmwrt = new _2methodsWithParametersmethodsWithoutReturnType();
		//mwpmwrt.calaculateSalary(1500, 800);
		mwpmwrt.calaculateTax();
		
		_2methodsWithParametersmethodsWithoutReturnType mwpmwrt1 = new _2methodsWithParametersmethodsWithoutReturnType();

		mwpmwrt1.calaculateTax();*/
		
		/*methodsWithoutParametersmethodWithReturnType mwpmwrt = new methodsWithoutParametersmethodWithReturnType();
		mwpmwrt.a=12;
		mwpmwrt.b=8;
		//int finalSum=mwpmwrt.addition1();
		
		int finalSum2=mwpmwrt.addition2();
		System.out.println(finalSum2*5);*/
		
		/*
		 * _4CalculateSalary cs = new _4CalculateSalary(); double
		 * salaryBeforeCovidBonus=cs.calculateEmpSalary(1200, 800);
		 * System.out.println("Salary to be credited after covid bonus is : " +
		 * (salaryBeforeCovidBonus+1000));
		 */
		
		_5IdCard empname = new _5IdCard();
		String name=empname.printName("Kerrie", " Wright");
		System.out.println("Name to be printed on ICard is :" + name + " MEDMA");
		
		
	}

}
