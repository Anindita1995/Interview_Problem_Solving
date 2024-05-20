package com.Prime_number;

public class Prime_Number {

	public static void main(String[] args) {
		//what is prime number?
		// Any natural number which is greater than 1; 
		// Only divisible by itself and 1;
		//Example: 1, 3, 5, 7, 11, 13, 17, 19... etc. 
		
		int num = 4;
		int count = 0; // this is to count divisible factor. 
		
		// we have 3 conditions here,
		//1: number  is > 1 
		//2: number can only divisible by 2 factors, 1 and itself
		//3: if the number is divisible by  more that 2,is not a Prime number
		
		if(num>1) { // con1: number  is > 1 
			
			for(int i=1;i<=num;i++) { // to count divisible factor we need count
				if(num%i==0) {
					count++;}
			}
			if(count==2) {//cond_2: number can only divisible by 2 factors, 1 and itself
				System.out.println("Prime Number");
			}else {
				System.out.println("Not Prime Number");
			}
			
		}else {
			System.out.println("Not Prime Number");
		}
		
	}
}
