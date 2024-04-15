package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MultiDArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<List<Integer>> multidarray = new ArrayList();

		for (int i = 0; i < 3; i++) {
			String[] strarry = sc.nextLine().replaceAll("\\s+$", " ").split(" ");
			List<Integer> intlist = Arrays.asList(strarry).stream().map(a -> Integer.parseInt(a))
					.collect(Collectors.toList());
			multidarray.add(intlist);
		}
		
		System.out.print("*****\n"+multidarray);
	}

}
