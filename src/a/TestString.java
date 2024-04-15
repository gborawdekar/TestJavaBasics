package a;

import java.util.Arrays;

public class TestString {

	public static void main(String[] args) {
		String x = new String("ab");
		change(x);
		System.out.println(x);

		String str = "This is String";
		String[] splited1 = str.split("\\s+");
		System.out.println("splited1:" + Arrays.toString(splited1));

		String str2 = "  This    is    String   ";
		String[] splited2 = str2.split("\\s+");
		System.out.println("splited2:" + Arrays.toString(splited2));

		String[] splited3 = str2.trim().split("\\s+");
		System.out.println("splited3:" + Arrays.toString(splited3));
		
		String[] splited4 = str2.split(" ");
		System.out.println("splited4:" + Arrays.toString(splited4));
	}

	public static void change(String x) {
		x = "cd";
	}
}