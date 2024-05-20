package com.swap;
//XOR operation ^
public class Logic_4 {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		//before swap
				System.out.println("Before swap: "+a+" "+b);
				a = a^b;//1
	/*a   = 3-> 11
	 *b   = 2-> 10
	 *a^b =     01->a
	 * 
	 */			
				b = a^b;//3
	/*a   =1   01
	 *b   =2  10
	 *a^b =3  11->b
	 * 
	 */			
				a = a^b;//2
	/*a   =1   01
	 *b   =3   11
	 *a^b =2   10->a
				 * 
				 */
				//After swap
				System.out.println("After swap: "+a+" "+b);

	}

}
