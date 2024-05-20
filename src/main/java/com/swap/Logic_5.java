package com.swap;
//single statement
public class Logic_5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println("Before swap: "+a+" "+b);
		b = (a+b)-(a=b);
	//	a =        5				
//		b =  15  - 5	= 10	
		System.out.println("After swap: "+a+" "+b);

	}

}
