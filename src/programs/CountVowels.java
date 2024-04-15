package programs;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to infosys...";
		List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

		int count1 = (int) Arrays.stream(str.split("")).filter(vowels::contains).count();
		System.out.println("count1:"+count1);
		
		int count2 = (int) Arrays.stream(str.split(""))
				.filter(s->vowels.contains(s)==true)
				.count();
		System.out.println("count2:"+count2);

	}

}
