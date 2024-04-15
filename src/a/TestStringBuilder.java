package a;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder x = new StringBuilder("ab");
		change(x);
		System.out.println(x);

		System.out.println("1+1" + 2 + 2);   // 1+122
		System.out.println("1+1" + (2 + 2)); // 1+14
		// System.out.println("1+1"+2-2);
		System.out.println("1+1" + 2 * 2);   // 1+14
		System.out.println("1+1" + 2 / 2);   // 1+11

		/*
		 *  s1 : 96354
		 *  s2 : 96354
		 *  s3 : 96354
		 *  s4 : 96354
		 */
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		/* after adding below 2 stmts
		 * s1 : 96354
           s2 : 96354
           s3 : 2987074
           s4 : 2987074
		 */
		//s3 = new String("abcd");
		//s4 = "abcd";

		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		
		System.out.println("s1==s2 : " + (s1==s2));
		System.out.println("s1==s1 : " + (s1==s1));
		System.out.println("s1==s3 : " + (s1==s3));
		System.out.println("s3==s4 : " + (s3==s4));
		System.out.println("s3==s3 : " + (s3==s3));
		
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
		System.out.println("s3.equals(s4) : " + s3.equals(s4));
		
		String a = "Java"; 
		String b = "Java"; 
		System.out.println(a == b); // True
		
		String c = new String("Java"); 
		String d = new String("Java"); 
		System.out.println(c == d); // False
		
		String e = "Java"; 
		String f = new String("Java"); 
		System.out.println(e == f); // False
		System.out.println(e.equals(f)); // true

	}

	public static void change(StringBuilder x) {
		// x.delete(0, 2).append("cd");
		x = new StringBuilder();
		x.append("cd");
	}
}