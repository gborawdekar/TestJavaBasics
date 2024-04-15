package programs;

public class ValueOfPi2 {

	public static void main(String[] args) {
		double sum = 0.0;
		double result = 0.0;
		double denominator = 1.0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Sum:"+sum+"  denominator:"+denominator);
			System.out.println(denominator*denominator);
			System.out.println((1 / (denominator * denominator)));
			sum = sum + 1 / (denominator * denominator);
			System.out.println(sum);
			System.out.println("__________________________________");
			denominator++;
		}
		System.out.println(sum);
		result = Math.sqrt(sum * 6);	
		System.out.println(result);
	}

}
