package javalearnings;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(num+"is a prime");
		}
		else
		{
			System.out.println(num+"is not a prime");
		}

	}}