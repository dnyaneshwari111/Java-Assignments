package utility;

public class Employee extends Person {

		int empId;
		double BasicSalary;
		
		public Employee()
		{
			super();
		}
		
		public Employee(String name,int age,int empId,double BasicSalary)
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

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", BasicSalary=" + BasicSalary + "]";
		}
		public double calculateSalary()
		{
			return BasicSalary;
		}
		
}



