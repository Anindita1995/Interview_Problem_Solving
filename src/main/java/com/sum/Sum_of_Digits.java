package com.sum;

public class Sum_of_Digits {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int digits = 0;
		
		while(num>0) {
			digits = num%10;// get the last digit
			sum = sum+ digits;
			num = num/10; // eliminate the last digit
		}
		System.out.println("Summation of the given  number: "+sum);

	}

}
