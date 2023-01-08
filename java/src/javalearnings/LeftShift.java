package javalearnings;

public class LeftShift {
		public static void main (String[]args){
		int x=50,y=60;
		
		
		/*
		 * System.out.println(x<<2);/// using left shift System.out.println(x>>2);///
		 * using right shift System.out.println(x<<3); System.out.println(x>>3);
		 */
		
		// logical(&&) and bitwise(&)
		/*
		 * System.out.println(x<y&&x>y); // check the first condition true or false,if the first conditin it check second condition only first condition is trye
		 *  System.out.println(x<y&x>y);// check both condition true or false 
		 * System.out.println(x<y);
		 */

       //logical (||) and bitwise (|)
		System.out.println(x<y||x>y); // check the first condition true or false,if the first conditin false sktip the second
		 System.out.println(x<y|x>y);// check both condition true or false
		 System.out.println((x<y)?x:y);
		}
		}                                                                    
