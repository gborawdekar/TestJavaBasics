package a;

public class B extends A {
	public B() {
		System.out.println("B3");
	}

	{
		System.out.println("B2");
	}

	static {
		System.out.println("B1");
	}
	
	public static void test(){
		System.out.println("class B static test no param");
	}
	
	public static void test(String hello){
		System.out.println("Class B static test with param : "+hello);
	}
}
