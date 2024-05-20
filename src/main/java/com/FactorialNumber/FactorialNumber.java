package com.FactorialNumber;

public class FactorialNumber {
// 3! = 1*2*3 = 6
	public static void main(String[] args) {
		int num = 3;
		long factorial = 1;
		
		
		for(int i=1;i<=num;i++) {
			factorial= factorial*i;
			System.out.print(i+" * ");
		}
		System.out.println("\nFactorial of number "+num+": "+factorial);

	}

}
