package _8collections;

import java.util.ArrayList;
import java.util.Iterator;

public class _1LearningArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(); // Control+Shift+O
		//List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(56);
		list.add(78);
		list.add(44);
		list.add(99);
		list.remove(4);
		list.add(56);
		
		System.out.println("========WHILE LOOP RESULT===========================");

		int i=0;
        while(i<list.size())
        {
        	System.out.println(list.get(i));
        	i++;
        }
		
        System.out.println("========FOR LOOP RESULT===========================");
        for(int j =0; j<list.size();j++)
        {
        	System.out.println(list.get(j));
        }
		
        System.out.println("========ADVANCE FOR LOOP RESULT===========================");
        for(Integer l: list)
        {
        	System.out.println(l);
        }
        
        System.out.println("========ITERATOR LOOP RESULT===========================");
        Iterator<Integer> it=list.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
		
        
		ArrayList<String> menus = new ArrayList<>();
		menus.add("HOME");
		menus.add("GIFT CERTIFICATES");
		menus.add("BRANDS");
		menus.add("BLOGS");
		menus.add("CONTACT US");
		menus.add("DASHBOARD");
		
		System.out.println("========WHILE LOOP RESULT - MENUS===========================");
		
		int k=0;
		while(k<menus.size())
		{
			System.out.println(menus.get(k));
			k++;
		}
		
		System.out.println("========FOR LOOP RESULT - MENUS===========================");
		
		for(int m=0;m<menus.size();m++)
		{
			System.out.println(menus.get(m));
			
		}
		
		System.out.println("========ADVANCED LOOP RESULT - MENUS===========================");
		for(String menu : menus)
		{
			System.out.println(menu);
		}
		
		System.out.println("========ITERATOR LOOP RESULT- MENUS===========================");
		
		Iterator<String> it1=menus.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
