package excersise;

import java.util.Scanner;

public class Student {


		// TODO Auto-generated method stub
	//int[]id=new int[5];
	int stud;
	int total;
	String[]name;
	//int m1,m2,m3;
	//String[] name=new String[5];
	
	int m1;
	//[]m1=new int[5];
	int[]m2=new int[5];
	int m3;
	String[]named;
	
	//	char[]nam=name.toCharArray();
		/*
		 * String name2; char[]nam2=name2.toCharArray();
		 */
	
public void Details() {
Scanner details=new Scanner(System.in);
System.out.println("enter the number of students");
stud=details.nextInt();
int n=stud;
System.out.println("enter the students id ");
for(int i=0;i<stud;i++) {
	  total+=details.nextInt();
	}
//System.out.println(total);
System.out.println("enter the students name");
 String[] name=new String[n];
 for(int i=0;i <=n;i++) {
name[m3]=details.nextLine();
 }
 System.out.println();
 //System.out.println(name[m3].toCharArray());
	//name[i]=details.nextLine();
	//String[] name=new String[i];
String names=name[m3];
System.out.println("enter the students sub 1 mark ");
for(int i=0;i<names.length();i++) {
	System.out.println(names);
	m1=details.nextInt();
}


}


public static void main(String[] args) {
	Student student=new Student();
	student.Details();
}
}