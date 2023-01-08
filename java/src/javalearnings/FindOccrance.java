package javalearnings;

import java.util.Scanner;

public class FindOccrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter a string to find Occurance");
		String input = scanner.nextLine();
		System.out.println("enter a character to find Ocuurance");
	char charAt = scanner.next().charAt(0);
//String input="Sakthi Pradeep";
		//char[] charArray = nextLine.toCharArray();

//char toFind='p';
int occurance=0;
//
input=input.toLowerCase();
for(int i=0;i<input.length();i++) {

	if(input.charAt(i)==charAt) {
		occurance=occurance+1;

	}
}
	System.out.println(occurance);
	//}

//}
///////using Scanner




}
}

