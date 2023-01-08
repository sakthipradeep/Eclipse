package javalearnings;

import java.util.Scanner;

public class TriangleWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Using *
		 * int given=0; int Row,Column;
		 * 
		 * 
		 * System.out.println("enter number"); Scanner scanner=new Scanner(System.in);
		 * given=scanner.nextInt(); for(Row=0;Row<given;Row++){
		 * for(Column=0;Column<=Row;Column++){ System.out.print("* "); }
		 * System.out.println(); }
		 */
		
		
		
		
		//Using Number
		
				Scanner scanner=new Scanner(System.in);
				System.out.println("enter number");

				
		int given=0;
		int limit=scanner.nextInt();
		int Row,Column;
	
		 
		 for(Row=0;Row<limit;Row++){
			 for(Column=0;Column<=Row;Column++){
				 given=given+1;
				 System.out.print(given+" "); 
			 }
			 System.out.println(); }
		 }}
		
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
