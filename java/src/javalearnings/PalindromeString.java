package javalearnings;

public class PalindromeString {

	public static void main(String[] args) {
		String str=new String("dade");//string declaration
				String rev=new String("");//string declaration
		int strLength=str.length();//find the length of the string
		for(int i=strLength-1;i>=0;--i) {//iterate end to beginning
			rev=rev+str.charAt(i);
		}
if(str.toLowerCase().equals(rev.toLowerCase())) { //change string into lowercase then compared to reversed string)
	System.out.println(str+" is a  palindrome");
}
else {
	System.out.println(str+" not a palindrome");
}}
}
