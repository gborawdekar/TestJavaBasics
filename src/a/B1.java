package a;

public class B1 extends A1 {

	public void doSomething() {
		System.out.println("B1 doSomething");
	}

	@Override
	public String doSomething(String name) {
		System.out.println("B1 doSomething : " + name);
		return "Hi from B1" + name;
	}

	//@Override
	//The method B1NewMethod() of type B1 must override or implement a supertype method
	public void B1NewMethod() {
		System.out.println("B1NewMethod");
	}

	/* valid
	public Person doSomething(String name, String city) {
		return new Person(2, name, 25, city);
	}*/
	
	/* valid
	public Student doSomething(String name, String city) {
		return new Student(2, name, 25, city, "BE");
	}*/
	
	//Cannot reduce the visibility of the inherited method from A1
	/*private Person doSomething(String name, String city) {
		return new Person(2, name, 25, city);
	} */
	
}
