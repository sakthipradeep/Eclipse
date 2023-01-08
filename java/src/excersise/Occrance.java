package excersise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Occrance {
	private String name ;
	private int id;
	private int mark;

	public Occrance (String name,int id,int mark){
		super ();	
		this.name = name;
		this.id = id;
		this.mark = mark;
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
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first name");
		String st1=scanner.nextLine();
		System.out.println("enter second name");
		String st2=scanner.nextLine();
		System.out.println("enter third name");
		String st3=scanner.nextLine();
		System.out.println("enter student id");
		int id1 =scanner.nextInt();
		System.out.println("enter student id");
		int id2 =scanner.nextInt();
		System.out.println("enter student id");
		int id3 =scanner.nextInt();
		System.out.println("enter student mark");
		int m1 =scanner.nextInt();
		System.out.println("enter student mark");
		int m2 =scanner.nextInt();
		System.out.println("enter student mark");
		int m3 =scanner.nextInt();
		Occrance student1=new Occrance("kk",1,45);
		Occrance student2=new Occrance("kj",2,85);
		Occrance student3=new Occrance("kd",3,75);
		List <Occrance>alllist=new LinkedList<Occrance>();
		alllist.add(student1);
		alllist.add(student2);
		alllist.add(student3);

		for(int i=0;i<alllist.size();i++) {
			if(alllist.get(i).getMark()>50) {

				System.out.println(alllist.get(i).getName());	
				System.out.println(alllist.get(i).getId());		
				System.out.println(alllist.get(i).getMark());		
			}
		}
	}}




