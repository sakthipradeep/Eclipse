package javalearnings;

public class SumandAverage {

	public static void main(String[] args) {
	

		int[]arr1={5,5,5,5,5,5};
			int sum=0;
			double Average;
			for(int arr:arr1){
			sum=sum+arr;
			}
			int length=arr1.length;
			Average=((double)sum/(double)length);
			System.out.println(sum);
			 System.out.println(Average);

	}

}
