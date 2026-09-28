package customer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		FileOutputStream fos=new FileOutputStream("customer.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("Enter customer : "+ i);
			
			System.out.println("Enter customer name : ");
			String name=sc.next();
			
			System.out.println("Enter customer contact : ");
			int contact=sc.nextInt();
			
			
			System.out.println("Enter customer Email id: ");
			String emil=sc.next();
			
			System.out.println("Enter customer register no : ");
			int regno=sc.nextInt();
			
			RegisteredCustomer r =new RegisteredCustomer(name,emil,contact,regno);
			oos.writeObject(r);
		}
			
		oos.close();
		fos.close();
		System.out.println("Customer data saved successfully");
		}
}

	
		
	