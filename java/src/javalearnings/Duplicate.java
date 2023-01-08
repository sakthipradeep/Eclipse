package javalearnings;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.println("enter the string to find duplicate");
		String name;
		Scanner scanner=new Scanner(System.in);
		name=scanner.nextLine();
		int count = 0;
		char[]name1=name.toCharArray();
		System.out.println("duplicates characters ina given string;");
		for(int i=0;i<name.length();i++){
			for(int j=i+1;j<name.length();j++){
				if(name1[i]==name1[j]){
					System.out.println(name1[j]);
					count++;
					break;
			
			}
			}
			

		}
		System.out.println(count);
	}
} 