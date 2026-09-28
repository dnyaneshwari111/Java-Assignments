
public class Employee extends Person {

		private int empId;
		private double BasicSalary;
		
		Employee()
		{
			super();
			empId=0;
			BasicSalary=0;
		}
		
		Employee(String name,int age,int empId,double BasicSalary)
		{
			super(name,age);
			this.empId=empId;
			this.BasicSalary=BasicSalary;
			
		}
		
		public void display()
		{
			super.display();
			System.out.println("Employee Id : "+ empId);
			System.out.println("Basic Salary : "+BasicSalary);
		}
		
		public static void main(String[]args)
		{
			Employee E= new Employee("Dnyanuu",22,101,55000);
			E.display();
		
		}
		
}
	


