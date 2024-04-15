package a;

public class A1 {

	public void doSomething() {
		System.out.println("A1 doSomething");
	}

	public String doSomething(String name) {
		System.out.println("A1 doSomething : " + name);
		return "Hi " + name;
	}

	public int doSomething(int age) {
		System.out.println("A1 doSomething : " + age);
		return age;
	}
	
	public Person doSomething(String name, String city) {
		return new Person(1, name, 30, city);
	}

}
