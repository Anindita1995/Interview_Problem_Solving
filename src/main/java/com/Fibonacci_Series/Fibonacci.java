package com.Fibonacci_Series;

public class Fibonacci {

	public static void main(String[] args) {
		//Fibonacci's Series is 0 1 1 2 3 5 8 .......
		// to achieve that series
		
		//first two digit will print directly. 
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		
		System.out.println(n1);
		System.out.println(n2);
		// for the 3rd digit we need for loop, and the initial value of i =2; 
		//because i=0 & i =1 already printed as a n1, n2. 
		for(int i=2;i<=10;i++) {
			
			sum = n1+n2;
			System.out.println(" "+sum);
			n1 = n2;// this statement will update the value of n1. n2's value will assign to n1
			n2= sum;// latest value of sum will be signed to n2. 
		}

	}

}
