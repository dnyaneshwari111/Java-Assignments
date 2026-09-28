package Genericlasss;
import java.util.ArrayList;
import java.util.List;

public class ArrayOperation {

		
		public static <T> void printArray( T [] arr) {
			for(T n : arr)
				System.out.println(n + "*****");
		}
		
		public static <T> boolean search(T [] arr, T key) {
			boolean flag = false;
			for(T obj : arr) {
				if(obj.equals(key))
					flag = true;
			}
			return flag;
		}
		
		public static boolean search1(List<?> list) {
			return true;
		}
		
			
	
		public static void main(String[] args) {
			Integer [] arr = {45,32,78,11,90};
			ArrayOperation.printArray(arr);
			
			String [] words = {"java","python","javascript"};
			ArrayOperation.printArray(words);
			
			List<String> words1 = new ArrayList<>();
			System.out.println("Search :"+ArrayOperation.search1(words1));

			
			
		}
		
	}



