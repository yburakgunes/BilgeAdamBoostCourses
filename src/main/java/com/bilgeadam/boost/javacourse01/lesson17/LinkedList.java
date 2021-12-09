package com.bilgeadam.boost.javacourse01.lesson17;

public class LinkedList {
	public static void main(String[] args) {
		Node node = null;
		System.out.println(node);
		node = new Node();
		System.out.println(node);
		System.out.println(node.content());
		
		node.setData(7);
		System.out.println(node.content());
		
		Node node2 = new Node();
		System.out.println(node2);
		node2.setData(3);
		System.out.println(node2.content());
		
		node.setNext(node2);
		
		Node node3 = new Node();
		node3.setData(17);
		node2.setNext(node3);
		
		System.out.println(node.allcontent());
		
	}
}
