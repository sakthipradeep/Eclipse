package excersise;

import java.util.Scanner;

public class PalinDrome {

public static void main(String[] args) {
	
	
	/*//String str1=new String("malayalam");
	//String str2=new String("");
		String str1="malayalam";
		String str2="";
		  int length=str1.length();
		  
		  for(int i=length-1;i>=0;--i){
			  str2=str2+str1.charAt(i);
		  }
		  if(str2.toLowerCase().equals(str1)) {
			  System.out.println("yes"); } 
		  else {
		  
		  System.out.println("no");
		  }
				 }} */
	/*Scanner scanner=new Scanner(System.in);

	System.out.println("enter a string to reverse");
	String name=scanner.nextLine();

	String reversed="";
	char[] OriginalNum=name.toCharArray();
	for(int i=OriginalNum.length-1;i>=0;i--){
	reversed=reversed+OriginalNum[i];
	}
	System.out.println(reversed);
	    }	 */
	
	Scanner scanner =new Scanner(System.in);
	System.out.println("enter a string to reverse");
    String string=scanner.nextLine();
    StringBuffer reve=new StringBuffer();
    StringBuffer reverse = reve.append(string).reverse();
    System.out.println(reverse);
    
    
			//StringBuffer reverse = name.reverse();	
			//System.out.println(reverse);
}				
}
		/*public static void main(String[] args) {
			String str=new String("malayalam");//string declaration
					String rev=new String("");//string declaration
			int strLength=str.length();//find the length of the string
			for(int i=(strLength-1);i>=0;--i) {//iterate end to beginning
				rev=rev+str.charAt(i);
			}
	if(str.toLowerCase().equals(rev.toLowerCase())) {
		System.out.println(str+" is a  palindrome");
	}
	else {
		System.out.println(str+" not a palindrome");		
				
				
				
				*/
				
				
				
				
				
	