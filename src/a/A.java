package a;

public class A {
	public A() {
		System.out.println("A3");
	}

	{
		System.out.println("A2");
	}
	static {
		System.out.println("A1");
	}
	
	public static void test(){
		System.out.println("class A static test no param");
	}
	
	public static void test(String hello){
		System.out.println("Class A static test with param : "+hello);
	}
	
	public static void test2(){
		System.out.println("class A static test2 no param");
	}
}

