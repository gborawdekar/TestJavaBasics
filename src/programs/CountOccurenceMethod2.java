package programs;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceMethod2 {

	public static void main(String[] args) {

		String str = "Communication";
		Map<Character, Integer> charCount = new HashMap();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (charCount.containsKey(str.charAt(i))) {
				int count = charCount.get(str.charAt(i));
				charCount.put(str.charAt(i), ++count);
			} else {
				charCount.put(str.charAt(i), 1);
			}
		}
		System.out.println(charCount);
	}
}
