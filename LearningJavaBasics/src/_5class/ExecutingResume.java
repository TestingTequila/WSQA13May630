package _5class;

public class ExecutingResume {

	public static void main(String[] args) {

		// NameOfTheClassWhoseObjectYouWishToCreate aliasName = new NameOfTheClassWhoseObjectYouWishToCreate();
		
		_1Resume jason = new _1Resume();
		jason.firstName="Jason";
		jason.lastName="Roger";
		jason.mobileNumber=34234324;
		jason.experienceYears=7;
		
		System.out.println("First name = " + jason.firstName + " and Last Name = " + jason.lastName + " and mobile number is = " + jason.mobileNumber + " and total Experience is : " + jason.experienceYears + " years");
		
		
		_1Resume kerrie = new _1Resume();
		kerrie.firstName="Kerrie";
		kerrie.lastName="Wright";
		kerrie.mobileNumber=656464;
		kerrie.experienceYears=5;
		System.out.println("First name = " + kerrie.firstName + " and Last Name = " + kerrie.lastName + " and mobile number is = " + kerrie.mobileNumber + " and total Experience is : " + kerrie.experienceYears + " years");
		
		_1Resume ben = new _1Resume();
		ben.firstName="Ben";
		ben.lastName="Fletcher";
		ben.mobileNumber=43534534;
		ben.experienceYears=2;
		System.out.println("First name = " + ben.firstName + " and Last Name = " + ben.lastName + " and mobile number is = " + ben.mobileNumber + " and total Experience is : " + ben.experienceYears + " years");
		
		
		

	}

}
