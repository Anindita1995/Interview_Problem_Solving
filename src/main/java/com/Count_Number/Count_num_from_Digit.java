package com.Count_Number;

public class Count_num_from_Digit {

	public static void main(String[] args) {
		int num = 23456;
		int count = 0;
		
		while(num!=0) {
			num = num/10;// num/10 will give you new updated number which is 2345, 6 will be eliminated
			count++;
		}
		System.out.println("Number of digits in a given number is: "+count);

	}

}
