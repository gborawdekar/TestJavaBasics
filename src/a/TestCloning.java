package a;

public class TestCloning implements Cloneable {

	int rollno;
	String name;

	TestCloning(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	// All 3 methods are valid

	// public Object clone() throws CloneNotSupportedException {
	// return super.clone();
	// }

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	protected Object getClone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		try {
			TestCloning s1 = new TestCloning(101, "abc");

			TestCloning s2 = (TestCloning) s1.clone();

			TestCloning s3 = (TestCloning) s2.getClone();

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);
			System.out.println(s3.rollno + " " + s3.name);

		} catch (CloneNotSupportedException c) {
			c.printStackTrace();
		}

	}

}
