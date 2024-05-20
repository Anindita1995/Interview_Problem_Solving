package com.Palindrom_Number;
//Palindrome number is, if we reverse any number, it will remain same
//like, 343, 252; 55; 23432;
//we will use the logic for reverse number, and then we will use if else condition to
//check whether the number is same or not. 
import java.util.Scanner;

public class Logic_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		int ori_number = num;
		
		int reverse_num = 0;
		while(num!=0) {
			reverse_num = reverse_num*10+num%10;
			num = num/10;
		}System.out.println("Number after reversing: "+reverse_num);
		if(reverse_num == ori_number) {
			System.out.println(reverse_num+" is a Palindrom Number");
		}else {
			System.out.println(reverse_num+" is not a Palindrom Number");
		}
		
		
	}

}
