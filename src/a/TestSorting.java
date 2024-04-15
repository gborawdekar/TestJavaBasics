package a;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestSorting {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person(1, "ela", 50000, "Pune"),
				new Person(2, "suzen", 10000, "Kolhapur"), new Person(3, "ana", 60000, "Mumbai"),
				new Person(4, "steve", 20500, "Pune"), new Person(5, "yami", 10000, "Pune"),
				new Person(6, "ivv", 10000, "Kolhapur"),
				new Person(2, "suzen", 10000, "Ajara"));
	
		//Collections.sort(persons); //must implement Comparable
		
		Comparator<Person> comparator = (p1,p2)-> p1.getName().compareTo(p2.getName());
		Collections.sort(persons, comparator); //not required to implement Comparable	
		//Collections.sort(persons, comparator.reversed());
		//Collections.sort(persons, comparator.thenComparing((p1,p2)-> p1.getCity().compareTo(p2.getCity())));
		System.out.println(persons);
		
		Collections.sort(persons, comparator.thenComparing((p1,p2)-> p1.getCity().compareTo(p2.getCity())));
		System.out.println(persons);
		
		//Person[] personsarr = persons.stream().toArray(Person[]::new);
		// Exception in thread "main" java.lang.ClassCastException: a.Person cannot be cast to java.lang.Comparable
		//Arrays.sort(personsarr); //must implement Comparable
		//System.out.println("Arrays.Sort :" + Arrays.toString(personsarr));
		Map<String, String> h = new HashMap<String, String>();
		h.put("key", "value");
		
		Set<String> s = new HashSet<String>();
		s.add("String");
	}
}
