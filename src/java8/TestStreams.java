package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import a.Person;

public class TestStreams {

	public static void main(String[] args) {
		String[] names = new String[] { "abc", "abc", "aaa", "bbb", "aaa", "ccc", "aaa" };
		int l = names.length;
		List<String> nameList = Arrays.asList(names);
		System.out.println("Before Map:"+nameList+"\n");
		Map<Object, Long> result = nameList.stream()
				.map(String::toUpperCase)
				.collect(Collectors.groupingBy(s -> s, HashMap::new, Collectors.counting()));
		System.out.println(result+"\n");
		
		System.out.println("After Map:"+nameList+"\n");
//----------------------------------------------------------------------------------------------
		List<Person> persons = Arrays.asList(new Person(1,"aaa",10000,"Pune"),
				                             new Person(2,"bbb",10000,"Kolhapur"),
				                             new Person(3,"aaa",30000,"Mumbai"),
				                             new Person(4,"bbb",20000,"Pune"),
				                             new Person(5,"aaa",10000,"Pune"),
				                             new Person(6,"bbb",10000,"Kolhapur"));	
		Person[] personsarr = persons.stream().toArray(Person[]::new);	
		System.out.println(Arrays.toString(personsarr)+"\n");
		
		Map<String, Long> counts = persons.stream().collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
		System.out.println("Counting:\n"+counts);
		
		Map<String, Integer> summing = persons.stream()
				            .collect(Collectors.groupingBy(Person::getName, Collectors.summingInt(Person::getSalary)));
		System.out.println("Summing:\n"+summing);
		
		System.out.println("Before Map:"+persons+"\n");
		Integer sum = persons.stream()
		       .map(p->p.getSalary()+5000)
		       .reduce(Integer::sum)
		       .get();
		       //.findAny().get();
		       //.count();
		       //.forEach(System.out::println);
		System.out.println("sum:"+sum);
		System.out.println("After Map :"+persons+"\n");
//----------------------------------------------------------------------------------------------
		persons.stream()
	      .peek(System.out::println)
	      .collect(Collectors.toList());
//----------------------------------------------------------------------------------------------		
		List<List<String>> namesNested = 
				Arrays.asList(Arrays.asList("aaa", "bbb"), 
				Arrays.asList("ccc", "ddd"),
				Arrays.asList("eee", "fff"));
		List<String> namesFlatStream = namesNested.stream()
				                                  .flatMap(Collection::stream)
				                                  .collect(Collectors.toList());
		System.out.println(namesFlatStream+"\n");
//----------------------------------------------------------------------------------------------		
		Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);
	    List<Integer> collect = infiniteStream
	      //.skip(3)
	      .limit(5)
	      .collect(Collectors.toList());
		System.out.println(collect+"\n");
//----------------------------------------------------------------------------------------------
		long count = Stream.of("abc", "bcd").distinct().count();
		System.out.println("count:"+count+"\n");
			
		System.out.println(IntStream.range(0, 11).sum());
		
		IntStream ints = IntStream.of(3,2,1,5,3);                              
		ints.peek(System.out::print).allMatch(i -> i>1);
		
		System.out.println("-------------------");
		DoubleStream dbs = DoubleStream.of(1.1,1.0,0.8,0.6,1.5);                         
        dbs.skip(2).peek(in -> System.out.print((int)in)).limit(2).allMatch(d -> d<1);
        
        System.out.println("-------------------");
        Stream<String> streams = Stream.of("one","two","three");
        Optional<String> op = streams.filter(s -> s.length()>5). findFirst().flatMap(s->Optional.of("4"));
        System.out.println(op);                                     
	}

}
