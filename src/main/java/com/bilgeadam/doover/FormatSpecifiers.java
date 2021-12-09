package com.bilgeadam.doover;

public class FormatSpecifiers {
	//% [flags] [width] [.precision] [argsize] typechar
	public static void main(String[] args) {
		System.out.printf("Sağ tarafta yapışık 3 haneli sayılar: %4d \n", 1);
		System.out.printf("Sağ tarafta yapışık 3 haneli sayılar: %4d \n", 11);
		System.out.printf("Sağ tarafta yapışık 3 haneli sayılar: %4d \n", 111);
		System.out.printf("Sağ tarafta yapışık 3 haneli sayılar: % 4d \n", -11);
		System.out.printf("Sağ tarafta yapışık 3 haneli sayılar: % 4d \n\n", -11);
		
		System.out.printf("Sol tarafta yapışık 3 haneli sayılar: %-4d \n", 1);
		System.out.printf("Sol tarafta yapışık 3 haneli sayılar: %-4d \n", 11);
		System.out.printf("Sol tarafta yapışık 3 haneli sayılar: %-4d \n", 111);
		System.out.printf("Sol tarafta yapışık 3 haneli sayılar: %-4d \n", -11);
		System.out.printf("Sol tarafta yapışık 3 haneli sayılar: %-4d \n\n", -11);
		
		System.out.printf("Sağ tarafta yapışık 3 haneli sayılar sıfır ile ön dolgulu: %03d \n", 1);
		System.out.printf("Sağ tarafta yapışık 3 haneli sayılar sıfır ile ön dolgulu: %03d \n", 11);
		System.out.printf("Sağ tarafta yapışık 3 haneli sayılar sıfır ile ön dolgulu: %03d \n\n", 111);
		
		System.out.printf("Sağ tarafta yapışık 3 haneli virgüllü sayılar: %03f \n", (float) 10 / 3);
		System.out.printf("Sağ tarafta yapışık 3 haneli virgüllü sayılar: %03f \n", (float) 100 / 3);
		System.out.printf("Sağ tarafta yapışık 3 haneli virgüllü sayılar: %03f \n\n", (float) 1000 / 3);
		
		System.out.printf("Sağ tarafta yapışık 3 haneli virgüllü sayılar virgül sonra 2 hane : %10.2f \n", (float) 10 / 3);
		System.out.printf("Sağ tarafta yapışık 3 haneli virgüllü sayılar virgül sonra 2 hane : %10.3f \n", (float) 100 / 3);
		System.out.printf("Sağ tarafta yapışık 3 haneli virgüllü sayılar virgül sonra 2 hane : %10.4f \n\n", (float) 1000 / 3);
		
		System.out.printf("Sol tarafta yapışık 3 haneli virgüllü sayılar virgül sonra 2 hane : %-10.2f \n", (float) 10 / 3);
		System.out.printf("Sol tarafta yapışık 3 haneli virgüllü sayılar virgül sonra 2 hane : %-10.3f \n", (float) 100 / 3);
		System.out.printf("Sol tarafta yapışık 3 haneli virgüllü sayılar virgül sonra 2 hane : %-10.4f \n\n", (float) 1000 / 3);
		
		
		System.out.printf("Çoklu örnek % 10.2f %s %3d\n\n", (float)1000/3, "virgüllü sayısının integer hali",1000/3);
		System.out.printf("Çoklu örnek % 10.2f %s %3d\n\n", (float)100/3, "virgüllü sayısının integer hali",100/3);
		System.out.printf("Çoklu örnek % 10.2f %s %3d\n\n", (float)10/3, "virgüllü sayısının integer hali",10/3);
		
		System.out.println(String.format("Sağ tarafta yapışık 3 haneli virgüllü sayılar virgül sonra 2 hane : %10.2f \n", (float) 1234 / 67));
		
		
	}
}
