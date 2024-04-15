package programs;

import java.util.Arrays;

public class CountOccurenceMethod1 {

	static final int MAX_CHAR = 123;

	public static void main(String[] args) {

		int count[] = new int[MAX_CHAR];
		String str = "GEETAgeetaz1234111";
		int len = str.length();
		System.out.println("Before" + Arrays.toString(count));

		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		System.out.println("After" + Arrays.toString(count));

		char ch[] = new char[len];
		for (int i = 0; i < len; i++) {
			System.out.println("The occurrence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
		}

		for (int j = 0; j < MAX_CHAR; j++) {
			if (count[j] != 0) {
				// prints frequency of characters
				System.out.println((char) j + " --> " + count[j]);
			}
		}

	}
}
