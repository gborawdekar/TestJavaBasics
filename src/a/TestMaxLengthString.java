package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMaxLengthString {

	public static void main(String args[]) {
		String test = "babc";
		int j = 0;
		List<String> substrs = new ArrayList<>();
		for (int i = 0; i < test.length(); i++) {
			j = i + 1;
			do {
				System.out.println("i :" + i + " j: " + j);
				if (j == test.length()) {
					substrs.add(test.substring(i));
				} else {
					substrs.add(test.substring(i, j));
				}
				j++;
			} while (j <= test.length());
		}
		Collections.sort(substrs);
		String max = "";
		for (String s : substrs) {
			if (max.length() < s.length()) {
				max = s;
			}
		}
		System.out.println(substrs);
		System.out.println("Max length substrs :" + max);
	}
}
