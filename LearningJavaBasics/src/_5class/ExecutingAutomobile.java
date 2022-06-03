package _5class;

public class ExecutingAutomobile {

	public static void main(String[] args) {

		// NameOfTheClassWhoseObjectYouWishToCreate aliasName = new NameOfTheClassWhoseObjectYouWishToCreate();
		_2Automobile car = new _2Automobile();
		car.brandName = "Audi";
		car.numberOfEngines = 4;
		car.typeOfAutomobile = "CAR";
		car.numberOfHeadlights = 4;
		
		
		_2Automobile truck = new _2Automobile();
		truck.brandName="Merc";
		truck.numberOfEngines=8;
		truck.typeOfAutomobile="Truck";
		truck.numberOfHeadlights=2;
				

	}

}
