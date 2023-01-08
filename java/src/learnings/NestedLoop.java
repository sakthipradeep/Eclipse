package learnings;

import java.util.Scanner;

public class NestedLoop {

	
		static int square(int N)
		{
	      int nextN=(int) Math.floor(Math.sqrt(N));
	    		  return nextN*nextN;
		}
	
		public static void main(String[] args) {
Scanner scanner =new Scanner (System.in);
System.out.println("enteer number");
int n = scanner.nextInt();
System.out.println(square(n));

	
	
	
		
}}