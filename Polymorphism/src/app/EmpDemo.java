package app;

import staff.Administration;
import staff.Programmer;
import staff.SalesManager;
import utility.Employee;

public class EmpDemo {
	public static void main(String[] args) 
	{
		Employee [] allemps;
		allemps = new Employee[3];
		allemps[0]= new SalesManager("Puja", 31, 12, 500000.00,2.0, 1000.0);
		allemps[1]= new Programmer("Dyna", 32, 11, 600000.00,"ERP",6,5000.0);
		allemps[2]= new Administration("Rucha", 33 , 15, 700000.00,800000.00);
		for(int i=0; i<allemps.length; i++ ) 
		{
				allemps[i].display();
				System.out.println("*******************");
		}
		
		for(int i = 0; i < allemps.length; i++)
		{
			System.out.println(allemps[i]+"\n");
		}
		System.out.println("-----------------------------------");
		
	
	}

}
