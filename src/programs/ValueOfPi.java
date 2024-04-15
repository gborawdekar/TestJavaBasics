package programs;

public class ValueOfPi {

	public static void main(String[] args) {
		double sum = 0.0;
		double result = 0.0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Sum:"+sum+"  i:"+i);
			System.out.println("i*i:"+i*i);
			System.out.println("Division :"+(1 / (i * i)));
			sum = sum + (1 / (i * i));
			System.out.println(sum);
			System.out.println("__________________________________");
		}
		System.out.println(sum);
		result = Math.sqrt(sum * 6);	
		System.out.println(result);
	}

}
