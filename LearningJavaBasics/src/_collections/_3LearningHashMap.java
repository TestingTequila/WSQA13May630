package _collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class _3LearningHashMap {

	public static void main(String[] args) {

		// Map<String, Integer> phonebook = new HashMap<>();

		HashMap<String, Integer> phonebook = new HashMap<>();
		phonebook.put("Jason", 234234);
		phonebook.put("Roger", 45664);
		phonebook.put("Lee", 6886786);
		phonebook.put("Kerrie", 456346);

		Set<String> keys = phonebook.keySet();

		for (String key : keys) {
			System.out.println(key);
		}

		System.out.println("===============================");

		/*
		 * Iterator<String> it = keys.iterator(); while (it.hasNext()) {
		 * System.out.println(it); }
		 */
		
		Collection<Integer> value= phonebook.values();
		for(Integer v: value)
		{
			System.out.println(v);
		}

	}

}
