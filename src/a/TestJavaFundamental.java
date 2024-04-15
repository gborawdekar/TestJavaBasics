package a;

import JavaFundamentals.JavaFundamentals2;

public class TestJavaFundamental {
	public static void main(String args[]) {
		//JavaFundamentals1 cannot be resolved to a type 
		//JavaFundamentals1 have default access
		//JavaFundamentals1 obj1 = new JavaFundamentals1();
		
		//works as JavaFundamentals2 have public access 
		JavaFundamentals2 obj2 = new JavaFundamentals2();
	}
}
