package _4arrays;

public class _1LearningArraysWithKnownValues {

	public static void main(String[] args) {
		// WHAT ARE ARRAYS? Arrays are also like containers/Jars with multiple
		// compartments/section
		// that can hold multiple values.

		// 12, 14, 15, 17, 98, 11, 22, 33, 87, 99

		// dataType[] arrayName = {value1, value2, value3, value4......valueN}

		// WAP to print all the numbers mentioned above
		
		int[] numbers = { 12, 14, 15, 17, 98, 11, 22, 33, 87, 99 };
		
		Object[] numbers2 = { 12, 14, 15, 17, 98, 11, 22, 33, 87, 99, true, "Jason", 'c', 0.34 };
		
		System.out.println("=============For Loop Result======================================");
		
		for(int x=0; x<numbers.length; x=x+3)
		{
			System.out.println(numbers[x]);// 12, 15, 98
		}
		
		System.out.println("=============Advanced For Loop Result======================================");
		
		for(int num : numbers)
		{
			System.out.println(num);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
