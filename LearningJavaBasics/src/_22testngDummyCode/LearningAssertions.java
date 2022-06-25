package _22testngDummyCode;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningAssertions {

	public boolean checkBiggerNumber(int a, int b)
	{
		if(a>b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public int addition(int a, int b)
	{
		return a+b;
	}
	
	@Test
	public void validateCheckBigger()
	{

		SoftAssert sa = new SoftAssert();
		sa.assertTrue(checkBiggerNumber(10,12));
		System.out.println("Will this statement from checkBigger printed?");
		sa.assertAll();
	}
	
	@Test
	public void validateAddition()
	{
		Assert.assertEquals(addition(12,14), 26);
		System.out.println("Will this statement from addition printed?");
	}
}
