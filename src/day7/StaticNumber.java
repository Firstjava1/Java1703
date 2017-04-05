package day7;

public class StaticNumber {
	private StaticNumber() {
		
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int multi(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int div(int num1, int num2) {
		return num1 / num2;
	}
}
