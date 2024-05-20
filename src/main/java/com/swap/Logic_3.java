package com.swap;
//using * & /
public class Logic_3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		//before swap
				System.out.println("Before swap: "+a+" "+b);
				a = a*b;//5*2 = 10
				b = a/b;//10/2 = 5
				a = a/b;// 10/5 = 2
				//After swap
				System.out.println("After swap: "+a+" "+b);
	}

}
