package learnings;

public class Constructors {
	
	
	
	
	
	
	public void iamONE() {
		System.out.println("IAM ONE"); // it is a method 
	}
	public Constructors() {
		
		System.out.println("iam constructor"); // it is a no argument constructot
	}
	public Constructors(int speed) {
		System.out.println("iam constructor int");// argument constructor
	}
	public Constructors(String name) {
		System.out.println("iam constructor string");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructors object=new Constructors();
		Constructors object1=new Constructors(50);
		Constructors object2=new Constructors("bmw");
		Constructors objec=new Constructors();
		objec.iamONE();
	}

}
