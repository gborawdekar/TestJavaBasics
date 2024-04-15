package a;

import java.util.HashMap;
import java.util.Map;

public class TestClone {
	public static void main(String a[]) throws CloneNotSupportedException {
		User user1 = new User("Test1");
		System.out.println(user1.toString());

		User user2 = (User) user1.clone();
		System.out.println(user2.toString());

		System.out.println("Hashcodes before change:\n" + user1.hashCode() + "\n"
				+ user2.hashCode());
		
		user1.setName("changed");
		System.out.println(user2.toString());

		System.out.println("Hashcodes :\n" + user1.hashCode() + "\n"
				+ user2.hashCode());

		System.out.println("_____________________________________________\n");
		Map<String, User> testmap = new HashMap<>();
		testmap.put("one", new User("TestUsingMap"));

		User u1 = testmap.get("one");
		System.out.println(u1.toString());
		u1.setName("Changed obj1");
		
		User u2 = testmap.get("one");
		System.out.println(u2.toString());
		
		System.out.print("Hashcodes :\n" + u1.hashCode() + "\n" + u2.hashCode());
		
		System.out.println("_____________________________________________\n");
		
		User u3 = (User) testmap.get("one").clone();
		System.out.println(u3.toString());
		u3.setName("Changed obj2");
		
		User u4 = testmap.get("one");
		System.out.println(u4.toString());
		
		System.out.print("Hashcodes :\n" + u3.hashCode() + "\n" + u4.hashCode());
	}
}
