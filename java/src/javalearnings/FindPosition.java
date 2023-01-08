package javalearnings;

import java.util.Scanner;

public class FindPosition {
// ASCII VALUES FOR A->65 , a->97
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("enter the character:"); 
		 char given=scanner.next().charAt(0);
		 given=Character.toLowerCase(given);
		 
		 int position=(int)given; 
		 int Realposition=position-96;
		 System.out.println(Realposition);
		 
		 
		/* * 
		 * String given="sakthipradeep"; String ss=given.toLowerCase(); char
		 * cc=ss.charAt(0);
		 * 
		 * int position=(int)cc; int real=position-97;
		 * 
		 * System.out.println(real);
		 *///*/
	}

}
