package a;

public class TestStaticAndInstanceBlock {
	static char ch = 'a';
	int a = 10;

	// Static initialization block of A
	static {
		System.out.println("Static block runs");
		System.out.println("value of static character = " + ch);
		double a = Math.sqrt(16);
		System.out.println("value of static character = " + a);
		
	}

	// Instance initialization block of B
	{
		System.out.println("Instance Initialization block runs");
		System.out.println("Value of static character = " + ch);
		System.out.println("Value of instance variable = " + a);
	}

	public static void main(String... ar) {
		TestStaticAndInstanceBlock ob = new TestStaticAndInstanceBlock();
		TestStaticAndInstanceBlock ob1 = new TestStaticAndInstanceBlock();
	}
}