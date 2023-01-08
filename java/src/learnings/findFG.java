package learnings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class findFG {

	String str="sakthi";
	String rev="";
public void reverseString() {


StringBuffer str1=new StringBuffer(str);
str1.reverse();
System.out.println(str1);
		}

public void usingArray() {
	char[] ch=str.toCharArray();
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
}

public void usingList() {
	

	String str="sakthi";
	char[] str1=str.toCharArray();
	List<Character>list=new ArrayList<Character>();
	for(Character charr:str1){
	list.add(charr);
	}
	Collections.reverse(list);
	ListIterator iterator=list.listIterator();
	while(iterator.hasNext()){
	System.out.println(iterator.next());
	}
	
	
	
}
//publi class ArrayList() {
//public  static void main(String[]args){
public void using() {
String given="sakthipradeep";
char[] ch=given.toCharArray();
List<Character>list=new ArrayList<Character>();
for(Character chh:ch){
list.add(chh);
}
Collections.reverse(list);
ListIterator iterator=list.listIterator();
while(iterator.hasNext()){
System.out.println(iterator.next());
}
}

public void occur() {
String given="sakthipradeep";
int occurance=0;
char tofind='s';
String input=given.toLowerCase();
for(int i=0;i<input.length();i++){
 if(input.charAt(i)==tofind) {
	 occurance=occurance+1;
	 System.out.println("yes");
 }
}
System.out.println(occurance);
}


		public static void main(String[] args) {
			findFG find=new findFG();
			//find.usingArray();
			//find.usingList();
			find.occur();
}}