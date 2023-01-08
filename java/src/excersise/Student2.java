package excersise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Student2 {
	private String name;
	private int id;
	private int mark;
	public  Student2(String name,int id,int mark) {
		super();
		this.name=name;
		this.id=id;
		this.mark=mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner (System.in);
		System.out.println("enter first student name");
		String s1=scanner.nextLine();
		System.out.println("enter first  student second name");
		String s2=scanner.nextLine();
		System.out.println("enter first student third name");
		String s3=scanner.nextLine();
		System.out.println("enter first student mark");
		int m1=scanner.nextInt();
		System.out.println("enter first student mark");
		int m2=scanner.nextInt();
		System.out.println("enter first student mark");
		int m3=scanner.nextInt();
		System.out.println("enter first student id");
		int i1=scanner.nextInt();
		System.out.println("enter first student id");
		int i2=scanner.nextInt();
		System.out.println("enter first student id");
		int i3=scanner.nextInt();


		Student2 stuu1=new Student2(s1,i1,m1);
		Student2 stuu2=new Student2(s2,i2,m2);
		Student2 stuu3=new Student2(s3,i3,m3);

		List<Student2>allist=new LinkedList<Student2>();
		allist.add(stuu1);
		allist.add(stuu2);
		allist.add(stuu3);

		for(int i=0;i<allist.size();i++) {
			if(allist.get(i).getMark()>50)
			{
				System.out.println("name is"+allist.get(i).getName());
				System.out.println("name is"+allist.get(i).getId());
				System.out.println("name is"+allist.get(i).getMark());

			}
		}
	}

}
