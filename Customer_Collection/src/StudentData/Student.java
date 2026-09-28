package StudentData;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		Set<String>set=new HashSet<>();
		
		for(int i=0;i<s.length();i++) 
		{
			char ch=s.charAt(i);
			int count=0;
			if(set.contains(ch)){
				System.out.println(ch+count);
			}
			else{
				System.out.println(ch);
			}
		}
	}
}
			
		
		//accept string from user ,showing unique character in the string
		//if added succsfulu return true; hashset
		//show only repeated char
	


