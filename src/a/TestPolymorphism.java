package a;

public class TestPolymorphism {

	public static void main(String[] args) {
		A1 obj1 = new A1();

		A1 obj2 = new B1();

		B1 obj3 = new B1();

		obj1.doSomething();
		obj1.doSomething("geeta");
		obj1.doSomething(29);

		obj2.doSomething();
		obj2.doSomething("geeta");
		obj2.doSomething(29);
		//The method B1NewMethod() is undefined for the type A1
		//obj2.B1NewMethod();

		obj3.doSomething();
		obj3.doSomething("geeta");
		obj3.doSomething(29);
		obj3.B1NewMethod();
		
		//pass by value test
		IntWrap i = new IntWrap();
		i.x=10;
		IntWrap j = new IntWrap();
		j.x=20;
		
		swap(i,j);
		System.out.println(i.x + " "+j.x);
		
		
		int y = -1;
		System.out.println(y>>>29);
		System.out.println(y>>>29);
		System.out.println(y>>>5);
	}

	private static void swap(IntWrap i, IntWrap j) {
		int temp = i.x;
		i.x = j.x;
		j.x = temp;	
	}

}
