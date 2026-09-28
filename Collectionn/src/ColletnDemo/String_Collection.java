package ColletnDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class String_Collection {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter list elements size :");
		int n=sc.nextInt();
		
		List<String>list=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			list.add(sc.next());
		}

		System.out.println("Collected list :"+list);
//		System.out.println("Enter the index to remove");
//		int index=sc.nextInt();
//		list.remove(index);
//		
//		System.out.println("Collected list after removing:"+list);
//
//		System.out.println(list);
//		
		System.out.println("Number of elemets in list :"+list.size());
		
		for(String e : list) {
			System.out.println(e);
		}
		
		System.out.println("-----------");
		Iterator <String> it=list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			System.out.println("-----------");	
		ListIterator <String>li_it=list.listIterator();
		while(li_it.hasPrevious()) {
			System.out.println(li_it.previous());
		}
		System.out.println("-----------");
		list.forEach(s->System.out.println(s+" "));
		
		System.out.println("-----------");
		Collections.sort(list);
		System.out.println("After sort list :"+ list);
		
		Collections.reverse(list);
		System.out.println("Ater reverse list :"+list);
		
		Collections.reverseOrder();
		
		System.out.println("Ater reverse order list :"+list);
		

		if(list.contains("manu")) {
			System.out.println(list.indexOf("manu"));
		}
	}

}
