package com.Reverse_String;

public class Logic_1 {

	public static void main(String[] args) {
		String str = "ABCD";
		String rev = " ";
		
		//Here, 
		//str.charAt(0); will show the index value of the string
		//and index will be str.length-1
		
		for(int i=str.length()-1 ; i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("After reverse the String: "+rev);

	}

}
