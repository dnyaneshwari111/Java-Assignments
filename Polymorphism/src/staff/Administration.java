package staff;
import utility.Employee;


public class Administration extends Employee{
	double allowance;
	
	 public Administration()
	{
		
	}
	 public Administration(String name, int age, int empId, double BasicSalary,double allowance) {
		 super(name,age,empId,BasicSalary);
		 this.allowance=allowance;
	 }
	 
//	 public	void display()
//		{
//			super.display();
//			System.out.println("Allowance : "+allowance);
//		}
	 @Override
	 public String toString() {
		return super.toString()+"Administration [allowance=" + allowance + "]";
	 }

}
