package com.bilgeadam.boost.javacourse01.lesson19;

import java.util.Stack;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		Vector<Double> vect = new Vector<>();
		vect.add(1.23);
		vect.add(2.23);
		vect.add(3.23);
		vect.add(4.23);
		vect.add(5.23);
		vect.add(6.23);
		vect.add(1, 1.0);
		vect.add(2, 8.43);
		for (int i = 0; i < vect.size(); i++) {
			System.out.println(vect.get(i));
		}
		Stack<Integer>stack = new Stack<>();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
	}
	
}
