package Demo;
import java.util.Scanner;


public class ArrayExpectionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			
			System.out.println("Enter array size ");
			int size=sc.nextInt();
			int[]arr= new int[size];
			
			System.out.print("Enter array elements :");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			
			System.out.print("Enter index number :");
			int index=sc.nextInt();
			System.out.print("Elements :"+arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("Error :  Invalid array index");
			
		} 
		catch (NegativeArraySizeException e) {
			
			System.out.print("Error :  Array size can not be negative");
		}
		catch (Exception e) {
			
			System.out.print("Error :  Invalid Input");
		} 
	}
	
}

	