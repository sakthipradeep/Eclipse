package excersise;

import java.util.Scanner;

public class Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE CHARACTER");
Scanner scanner=new Scanner(System.in);
char given=scanner.next().charAt(0);
int position=(int)given;

int realpositionofsmall=position-64;
//int realpositionofsBig=position-64;


if (realpositionofsmall<=65) {
System.out.println("POSITION OF YOUR ENTERED NUMBER IS :"+realpositionofsmall);

}
else if (realpositionofsmall>=96) {
	System.out.println("POSITION OF YOUR ENTERED NUMBER IS :"+realpositionofsmall);

	}
	}
}


	


