package _22testngDummyCode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {

	@DataProvider
	public Object[][] getData()
	{
		Object[][] numbers = {{12,34},{45,67},{78,90}};
		return numbers;
		
	}
	
	@Test(dataProvider="getData")
	public void addNumbers(int a, int b)
	{
		System.out.println((a+b));
	}
}
