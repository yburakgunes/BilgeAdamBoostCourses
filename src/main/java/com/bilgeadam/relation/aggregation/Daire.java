package com.bilgeadam.relation.aggregation;

public class Daire {
	public double daireAlanHesabi(int r) {
		double pi = Math.PI;
		Yaricap yaricap = new Yaricap();
		int result = yaricap.daire(r);
		
		return result * pi;
	}
}
