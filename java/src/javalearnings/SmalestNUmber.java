package javalearnings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmalestNUmber {


	Integer []one= {90,56,35,89,12,120,520};
	
	//USING NORMAL METHOD
	public  void usingNormalMETHOD() {

		int	smallest=Integer.MAX_VALUE; //assign highest int value
		for(int i=0;i<one.length;i++) {// first number smallest ta vida chinadha irundha adhan smallest
			if(one[i]<smallest) {
				smallest=one[i];
			}
		}
		System.out.println(smallest);                                      
	}


	//USING ARRAY
	public void usingARRay() {
		Arrays.sort(one);
		System.out.println(one[0]);	}	

	//USING COLLECTION LIST
	public void usingList() {
		List<Integer>list=Arrays.asList(one);
		Collections.sort(list);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmalestNUmber smallest=new SmalestNUmber();
		//smallest.usingNormalMETHOD();
		smallest.usingARRay();
		//smallest.usingList();
	}

}
