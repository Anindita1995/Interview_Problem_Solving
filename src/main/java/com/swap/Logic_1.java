package com.swap;
//using third variable
public class Logic_1 {

	public static void main(String[] args) {
		int a = 10;
		int b= 3;
		//before swap
		System.out.println("Before swap: "+a+" "+b);
		int c;
		c = a;//10 is assign to C bcz a=10.
		a = b;//3 is assign to  A bcz B=3.
		b = c;//10 is assign to B bcz C =10.
		//After swap
		System.out.println("After swap: "+a+" "+b);

	}

}
