package com.bilgeadam.boost.javacourse01.lesson30;

public class MethodExample {
	public static void main(String[] args) {
		int a = 3;
		double b = 3.0;
		double x = add(a, b);
		System.out.println(x);
		System.out.println(divide(add(a, b), b));
//		System.out.println(multiply((int)add(a, b), x));
	}
	
	static void multiply(int x, double y) {
		double z = x * y;
	}
	
	static double add(int x, double y) {
		return x + y;
	}
	
	static double divide(double x, double y) {
		if (y != 0)
			return x / y;
		else
			return 0;
	}
}
