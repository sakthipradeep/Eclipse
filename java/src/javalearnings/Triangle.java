package javalearnings;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		int lines=0;
		System.out.println("entr the line");
		Scanner scanner=new Scanner(System.in);
	lines=scanner.nextInt();
	int Row,Column;
	for(Row=0;Row<lines;Row++) {//outer loop row
		for(Column=0 ;Column<=Row;Column++) {
			System.out.print("* ");
		}
		System.out.println();
	}
		
		
		
		
		
		
		
		
		
		

	}

}
