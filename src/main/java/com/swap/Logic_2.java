package com.swap;
//using + & -
public class Logic_2 {

	public static void main(String[] args) {
		int a = 30;
		int b = 40;
		//before swap
		System.out.println("Before swap: "+a+" "+b);
				
		a = a+b;//30+40 = 70
		b = a-b;//70-40 = 30
		a = a-b;//70-30 = 40			
				
				
				//After swap
				System.out.println("After swap: "+a+" "+b);

	}

}
