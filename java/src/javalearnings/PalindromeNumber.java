package javalearnings;

public class PalindromeNumber {

	public static void main(String[] args) {
int num=3553,reminder = 0;
int Originalnum=num;
while(num>0) {
//	reminder=num%10;
	//reversednum=reversednum*10+reminder;
	//num/=10;
	reminder=(reminder*10)+num%10;
	num=num/10;
}
System.out.println(reminder);
if(Originalnum==reminder) {
	System.out.println("yes");
}else
	System.out.println("no");
	}

}
//