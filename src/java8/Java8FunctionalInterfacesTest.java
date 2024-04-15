package java8;

import java.util.Optional;
import java.util.function.Predicate;

public class Java8FunctionalInterfacesTest {

	public static void main(String[] args) {

		Predicate<String> p = s -> s.equalsIgnoreCase("abc");
		String a = "abc";
		if (p.test(a)) {
			System.out.println("equals");
		}

		Optional<String> optest = Optional.empty();
		System.out.println(optest.isPresent());
		String a1 = optest.orElse("testOp");
		String a2 = optest.orElseGet(() -> "orelsegettest");
		System.out.println(a1 + "   " + a2);
	}

}
