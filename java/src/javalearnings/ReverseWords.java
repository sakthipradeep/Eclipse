package javalearnings;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="vanakam da mapla";
		String str1="";
	String []temp=string.split(" ");
	for(int i=temp.length-1;i>=0;i--) {
		str1=str1+temp[i]+(" ");
	}
	System.out.println(str1);

	}

}
