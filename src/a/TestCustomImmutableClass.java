package a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestCustomImmutableClass {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("1", "first");
		map.put("2", "second");

		CustomImmutableClass s = new CustomImmutableClass("ABC", 101, map);

		System.out.println(s.getName());
		System.out.println(s.getRegNo());
		System.out.println(s.getMetadata());

		map.put("3", "third");
		System.out.println("After adding 3rd \n"+s.getMetadata()+"\n");

		s.getMetadata().put("4", "fourth");
		System.out.println("After adding 4th \n"+s.getMetadata()+"\n");

		CustomImmutableClass s1 = new CustomImmutableClass("AAA", 102, map, "");
		System.out.println("\nmap : " + map+"\n");
		System.out.println(s1.getName());
		System.out.println(s1.getRegNo());
		System.out.println(s1.getMetadata());

		map.put("3", "updatedthird");
		System.out.println("After updating 3rd\n"+s1.getMetadata()+"\n");

		s1.getMetadata().put("4", "updatedfourth");
		System.out.println("After adding 4th \n"+s1.getMetadata());

		System.out.println("Iterating over map using Iterator");
		Iterator<String> mapIterator = map.keySet().iterator();
		while (mapIterator.hasNext()) {
			System.out.println(map.get(mapIterator.next()));
		}

	}

}
