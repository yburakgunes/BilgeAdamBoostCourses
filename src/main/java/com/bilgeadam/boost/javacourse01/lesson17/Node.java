package com.bilgeadam.boost.javacourse01.lesson17;

public class Node {
	int data;
	Node next;
	
	void setData(int data) {
		this.data = data;
	}
	
	int getData() {
		return this.data;
		
	}
	
	void setNext(Node next) {
		this.next = next;
	}
	
	Node getNext() {
		return this.next;
	}
	
	public String content() {
		return "Düğümün içeriği: [data=" + data + ", next=" + next + "]";
	}
	
	public String allcontent() {
		String retVal = "";
		
		Node temp = this;
		while (temp != null) {
			retVal += temp.data + " -->";
			temp = temp.next;
		}
		return retVal;
	}
	
}
