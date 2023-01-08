package dsa;

public class StackImplementation {

	public static void main(String[] args) {
	
		Stacks obj=new Stacks();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		
		System.out.println(obj.pop());
	}
}
