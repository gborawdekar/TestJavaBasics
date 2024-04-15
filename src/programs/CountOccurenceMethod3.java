package programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountOccurenceMethod3 {

	public static void main(String[] args) {

		String str = "Communication";
		Map<String, Long> result = Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()));
		System.out.println(result);
	}
}


/*
Accumulate names into a List
     List<String> list = people.stream().map(Person::getName).collect(Collectors.toList());

     // Accumulate names into a TreeSet
     Set<String> set = people.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));

     // Convert elements to strings and concatenate them, separated by commas
     String joined = things.stream()
                           .map(Object::toString)
                           .collect(Collectors.joining(", "));

     // Compute sum of salaries of employee
     int total = employees.stream()
                          .collect(Collectors.summingInt(Employee::getSalary)));

     // Group employees by department
     Map<Department, List<Employee>> byDept
         = employees.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment));

     // Compute sum of salaries by department
     Map<Department, Integer> totalByDept
         = employees.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,
                                                   Collectors.summingInt(Employee::getSalary))); */