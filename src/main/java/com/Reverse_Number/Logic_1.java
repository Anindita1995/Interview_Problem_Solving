package com.Reverse_Number;

//Using algorithm
import java.util.Scanner;

public class Logic_1 {

	public static void main(String[] args) {
		// Using scanner class for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();// using nextInt method from Scanner class to store the input to the variable
		
		int rev = 0;
		while(num!=0) {
			rev = rev*10+num%10;
//				  0*10+ 123%10  =   3(rev1)
//				  3*10+ 12%10   =  32 (rev2)
//				  32*10+ 1%10   = 321 (rev3)
			num = num/10;
		}
		System.out.println("After reversing the number: "+rev);
		
	}

}
