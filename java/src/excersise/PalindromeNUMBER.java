  package excersise;

public class PalindromeNUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// PALINDROME NUMBER??
		
		int num=3553;
		int reversed=0;
		int reminder;
		int original;
		original=num;
		
		while(num!=0) {
			reminder=num%10;
			reversed=reversed*10+reminder;
			num=num/10;
			
		}
		if(reversed==original) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
