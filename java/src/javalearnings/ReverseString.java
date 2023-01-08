package javalearnings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

// com.sun.tools.classfile.CharacterRangeTable_attribute;

public class ReverseString {
	public static void main(String[] args) {
		
		  // Using StringBuffer String 
		  //  String string="sakthipradeep";
		   StringBuffer string1=new StringBuffer("sakthi"); 
		   //string1.append(string);
		   //string1.reverse();
		   System.out.println(string1.reverse());
		 
	
		
		/*
		 * //Using Array String str="sakthi"; 
		 * String str2=""; 
		 * char[]
		 * str1=str.toCharArray(); 
		 * for(int i=str1.length-1;i>=0;i--) {
		 * str2=str2+str1[i];
		 *  } 
		 *  System.out.println(str2);
		 */
		
		//Using ListIterator
		/*
		 * String str="sakthi"; char[] str1=str.toCharArray(); List<Character>list=new
		 * ArrayList<Character>(); for(Character character:str1) { list.add(character);
		 * } Collections.reverse(list); ListIterator iterator=list.listIterator();
		 * while(iterator.hasNext()) { System.err.println(iterator.next()); }
		 */
		/*public class RevStringIterator{
			public static void main(String [] args){*/
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
			
		}}
	
	

