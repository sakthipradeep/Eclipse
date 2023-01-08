package javalearnings;
public class Encapsulation {
    private String stuName;
	public String getName() {
	return stuName;	
	}
	public void setName(String newName) {
		stuName=newName;
	}
	public static void main(String[] args) {
	Encapsulation kk=new Encapsulation();
	kk.setName("sakthi");
	System.out.println(kk.getName());
	}
	}
