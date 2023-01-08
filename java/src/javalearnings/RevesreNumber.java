package javalearnings;

import java.util.Scanner;

public class RevesreNumber {
	
		public static void main	(String []args){
			
			int number=567;
			int Reversed=0;
			
			System.out.println("enter the number");
			Scanner scanner=new Scanner(System.in);
			number=scanner.nextInt();
			
	//int number=0;
	//int Reversed=0;
	while(number!=0) {
		 Reversed=Reversed*10;
		 Reversed=Reversed+number%10;
		 number/=10;
		 
	}
	System.out.println(Reversed);
		}
}

