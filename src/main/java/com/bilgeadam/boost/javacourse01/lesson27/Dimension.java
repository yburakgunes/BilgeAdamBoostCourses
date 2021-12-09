package com.bilgeadam.boost.javacourse01.lesson27;

import java.io.Serializable;

public class Dimension implements Serializable {
	
	private static final long serialVersionUID = 4988038840286091311L;
	private double length;
	private double width;
	
	public Dimension() {
		// TODO Auto-generated constructor stub
	}
	
	public Dimension(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		return (width * length);
	}
	
	@Override
	public String toString() {
		return "Dimension [length=" + length + ", width=" + width + "]";
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
}
