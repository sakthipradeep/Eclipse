package learnings;

public class SecondConstructor extends Constructors {
	
	
	
	
	//this class constructor
public  SecondConstructor() {
	
	System.out.println("iam SecondConstructor ");
	
	
}
	public SecondConstructor(int speed) {
		super(speed);
		System.out.println("iam explicit construvtor");
	}
	
	
	

	public int iamONE(int i) {
		System.out.println("IAM two"); // it is a overtide method 
		return 10;
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondConstructor obj =new SecondConstructor(50);
	obj.iamONE();
	}

}
