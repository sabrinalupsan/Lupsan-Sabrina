package maths;

public class Mathematics {
	
	public static int a, b;
	public static String choice;
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int product(int a, int b) {
		return a*b;
	}

	public static void main(String[] args) {
		
		choice = args[1];
	}

}
