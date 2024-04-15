package programs;

import java.util.Scanner;

public class FibonacciSeriesProgram {
	// 1,1,2,3,5,8,13,21;
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();

		int a = 0, b = 1, res;

		System.out.print("" + a + " " + b);

		for (int i = 2; i < count; i++) {
			res = a + b;
			System.out.print(" " + res);
			a = b;
			b = res;
		}
	}

}
