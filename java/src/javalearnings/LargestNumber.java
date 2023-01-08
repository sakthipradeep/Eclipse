package javalearnings;

import java.util.Arrays;

public class LargestNumber {

	
	
public static int largest(int[]a,int total) {
	Arrays.sort(a);
	return a[total-1];
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {1,2,3,4,6,5};
		int[] total= {100,95,62,102,56,500};
		
		System.out.println("largest"+largest(a,6));
		System.out.println("largest"+largest(total,6));

		
	}

}
