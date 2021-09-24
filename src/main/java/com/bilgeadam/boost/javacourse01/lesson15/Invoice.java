package com.bilgeadam.boost.javacourse01.lesson15;

public class Invoice {
	static double totalAmount = 0.0d;
	static int numberOfInvoices = 0;
	static double maxInvoiceValue = Double.MIN_VALUE;
	
	String name;
	double netValue;
	double taxedValue;
	
	void calcVAT(int vatRatio) {
		double tax = (netValue * vatRatio) / 100;
		this.taxedValue = this.netValue + tax;
		totalAmount += this.taxedValue;
		numberOfInvoices++;
		if (this.taxedValue > maxInvoiceValue) {
			maxInvoiceValue = this.taxedValue;
		}
	}
	
	static double average() {
		return totalAmount / numberOfInvoices;
		
	}
}
