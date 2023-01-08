package javalearnings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class ArraycontainelementoraNOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[] intt= {1,5,694,8,5,6,3,9};
/*
 * Scanner scanner=new Scanner(System.in);
 * System.out.println("Enter the Number");
 */

//int number=5;

/*boolean statue=false;

for (int i : intt) {
	if(i==number) {
		statue=true;
		break;
	}
}
if(statue) {
	System.out.println("yes");
}else
	System.out.println("no");
	}

}
*/
/*
 * 
 * boolean found=IntStream.of(intt).anyMatch(element->element==number);
 * if(found) { System.out.println("yes"); }else { System.out.println("no"); }
 * 
 */
	////////
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter the NUMBERS TO FIND");
	int nextInt = scanner.nextInt();
	int[]kl=new int[nextInt];
	for (int string : kl) {
		System.out.println(string);
	}
	int ki=nextInt;
	
	//Set<Integer>set=new HashSet<Integer>();
	List<Integer> asList = Arrays.asList(ki);
	System.out.println(asList);
	//List<Integer> asList = Arrays.asList(ki);
	System.out.println("enter to find element");
	int tofind = scanner.nextInt();
	int max=Collections.max(asList);
	
	//boolean found1=IntStream.of(tofind).anyMatch(element->element==asList);
	if(max>tofind) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
	
	
	
	
	
	
	
	
	
	
	}}