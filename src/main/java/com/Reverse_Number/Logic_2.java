package com.Reverse_Number;

//using String Buffer
public class Logic_2 {

	public static void main(String[] args) {
	// to reverse Number we can use String Buffer to use reverse() method. 
		
		int num = 456;
		
		StringBuffer rvrs;//instance of StringBuffer
		//First, we need to create an object of a StringBuffer. 
		/*Then to convert the integer value into the String we need to use 
		 * valueof() method from String class*/
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rvrs = sb.reverse();//then we need to call reverse() method and assign them to the instance of StringBuffer class  
		
		System.out.println("Given number: "+num);
		System.out.println("Reverse number: "+rvrs);
	}

}
