package dsa;

public class Stacks {

	int[]container=new int [10] ;
	int Top;
	
	Stacks() {
		Top=-1;
	}
	void push(int number) {
		if(Top==9)
			System.out.println("stack is full");
		else
			container[++Top]=number;

	}
	int pop() {
		if(Top>=0)
		return container[Top--];
		else {
			System.out.println("stack is empty");
			return -1;
		}
	}
}
