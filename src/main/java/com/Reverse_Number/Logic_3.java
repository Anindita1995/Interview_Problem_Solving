package com.Reverse_Number;

//Using String Builder
public class Logic_3 {

	public static void main(String[] args) {
		
		int num = 678;
		
		StringBuilder s_builder = new StringBuilder();//First we created an object of String Builder class
		s_builder.append(num);//used append() method from String Builder to add the number to it. 
		StringBuilder builder_reverse = s_builder.reverse();// create another instance of the String Builder class and
		//assign the reverse value of the number. 
		
		System.out.println("Given number: "+num);
		System.out.println("Reverse number: "+builder_reverse);

	}

}
