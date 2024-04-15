package programs;

public class FactProgram {

	public static void main(String args[]) {

		int no = 10, fact = 1;

		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial: " + fact);
		fact = 1;
		for (int i = no; i >= 1; i--) {
			fact = fact * i;
		}

		System.out.println("Factorial: " + fact);
	}

}
