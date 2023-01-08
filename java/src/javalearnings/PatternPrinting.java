package javalearnings;

public class PatternPrinting {          //PATTERN PRNTING *****
	//                                                    *
	//                                                    ***
	//                                                    *
	//                                                    *****
	

	
		// TODO Auto-generated method stub
public void patternOne() {
		for(int i=0;i<=5;i++) {     //  *
			for(int j=0;j<i;j++) {  //  **
			System.out.print("*");  //  ***
		}System.out.print("\n");    //  ****
			}                       //  *****
}	

public void patternTwo() {
	for(int i=5;i>=0;--i) {          // *****
		for(int j=0;j<i;j++) {       // ****
			System.out.print("*");   // ***
		}                            // **
		System.out.print("\n");      // *
		}
	}

public void patternThree() {
	for(int i=5;i>=0;--i) {
		for(int j=0;j<i;j++) { 
			System.out.print("*");
			
		}
		System.out.print("\n");
		if(i>4) {
			
		}
	}
}

		public static void main(String[] args) {
			
			PatternPrinting object=new PatternPrinting();
			//object.patternOne();
			//object.patternTwo();
			object.patternThree();
		}
		}