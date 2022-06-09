package _collections;

import java.util.HashSet;
import java.util.Iterator;

public class _2LearningHashSet {

	public static void main(String[] args) {

       // Set<String> set = new HashSet<>();
		HashSet<String> programmingLang = new HashSet<>();
		programmingLang.add("Java");
		programmingLang.add("C#");
		programmingLang.add("Python");
		programmingLang.add("JavaScript");
		programmingLang.add("Ruby");
		programmingLang.add("Java");
		
		System.out.println("===================ADVANCED FOR LOOP=============");
		for(String pl: programmingLang )
		{
			System.out.println(pl);
		}
		
		System.out.println("===================ITERATOR LOOP=============");
		Iterator<String> it=programmingLang.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
