package javalearnings;

public class Swapp {
	
	public static void main(String[] args) {
		Swapp swap=new Swapp();
		//swap.swaperWithTHIRDvariable();
		//swap.swaperWithADDition();
		swap.swaperWithMultiplication();
	}

	public void swaperWithMultiplication() {
		int a=100;
		int b=50;
		System.out.println("Before swapping a"+a+"Before swaping"+b);
		a=a*b;
		b=a/b;
		a=a/b ;
		System.out.println("After swapping a"+a+"After swaping"+b);
	}
		public void swaperWithADDition() {
			int a=100;
			int b=50;
			System.out.println("Before swapping a"+a+"Before swaping"+b);
			a=a-b;
			b=a+b;
			a=b-a;
			System.out.println("After swapping a"+a+"After swaping"+b);
			
		}
		
		
		
		
		
		public void swaperWithTHIRDvariable() {
		int a=50;
		int b=20;
		int temp;
		
		//System.out.println("Before swapping"+a+"""+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping"+a+"After swaping"+b);
		}
	}
