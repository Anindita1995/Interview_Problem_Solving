package com.Palindrom_String;

public class Logic_1 {

	public static void main(String[] args) {
		String str = "ABCBA";
		String reverse = "";
		
		int str_length = str.length();
		
		
		for(int i=str_length-1;i>=0;i--) {
			reverse = reverse+str.charAt(i);//this logic is similar to sum = sum+i where sum = 0; 
		}System.out.println(reverse);
		if(str.equals(reverse)) {
			System.out.println(reverse+" is a Palindrom String");
		}else {
			System.out.println(reverse+" is not a Palindrom String");
		}

	}

}
