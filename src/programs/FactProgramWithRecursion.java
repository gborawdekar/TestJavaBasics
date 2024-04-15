package programs;

public class FactProgramWithRecursion {

	public static void main(String args[]) {

		int no = 5;

		System.out.println("Factorial: " + calFact(no));
	}

	public static int calFact(int no) {
		if (no == 0)
			return 1;
		else
			return no * calFact(no - 1);

	}

}
