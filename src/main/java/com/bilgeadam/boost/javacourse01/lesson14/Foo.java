package com.bilgeadam.boost.javacourse01.lesson14;

public class Foo {
	int a = 100;
	int b = 100;
	
	public static void main(String[] args) {
		
		Foo foo = new Foo();
		System.out.println(foo.f(2));
		System.out.println(foo.f(3));
		
	}
	
	int f(int a) {
		int b = 1;
		if (a == 2) {
			return a + b;
		}
		
		return this.a + this.f(2);
	}
}
