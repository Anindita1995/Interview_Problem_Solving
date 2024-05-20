package com.Count_Number;

public class Count_even_odd_from_Digits {

	public static void main(String[] args) {
		int num = 346;
		int even = 0;
		int odd = 0;
		int last_digit = 0;
		
		while(num!=0) {
			last_digit = num%10;
			
			if(last_digit%2==0) {
				even++;
			}else {
						
				odd++;
			}
			num = num/10;
		}
		System.out.println("Number of Even Number: "+even);
		System.out.println("Number of Odd Number: "+odd);
		

	}

}
