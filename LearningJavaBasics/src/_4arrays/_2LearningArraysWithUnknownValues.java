package _4arrays;

public class _2LearningArraysWithUnknownValues {

	public static void main(String[] args) 
	{
		// dataType[] arrayName = new dataType[numberOfItemsYouWantToHold];
		
		int[] numbers = new int[7];
		numbers[3]=12;
		numbers[5]=100;
		numbers[0]=45;
		numbers[1]=67;
		numbers[6]=55;
		numbers[2]=76;
		numbers[4]=44;
		//numbers[7]=82;
	
		
		for(int num: numbers)
		{
			//System.out.println(num);
		}
		
		
		String[] menus = new String[5];
		menus[0]="HOME";
		menus[1]="GIFT CERTIFICATES";
		menus[2]="BRANDS";
		menus[3]="BLOGS";
		menus[4]="CONTACT US";
		
		for(String menu: menus)
		{
			// Code to click on each menu
			System.out.println(menu);
		}
		
		
		
		
		
	}
}
