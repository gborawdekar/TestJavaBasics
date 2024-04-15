package a;

public class TestException {

	public static void main(String... ar) {
		A a = new B();
		a.test();
		a.test("A");
		
		A.test();
		A.test("hello");
		A.test2();
		
		B.test();
		B.test("there");
		B.test2();
		
	}
}
