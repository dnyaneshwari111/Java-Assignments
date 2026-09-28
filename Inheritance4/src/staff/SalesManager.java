package staff;

import utility.Employee;

public class SalesManager extends Employee {
	
	private double salesTarget;
	private double perComission;

	public SalesManager()
	{
		super();
	}
	
	
	public SalesManager(String name, int age, int empId, double BasicSalary,double salesTarget,double perComission) {
		super(name,age,empId,BasicSalary);
		this.perComission=perComission;
		this.salesTarget=salesTarget;
		
	}

	@Override
	public String toString() {
		return super.toString()+"SalesManager [salesTarget=" + salesTarget + ", perComission=" + perComission + "]";
	}


	public	void display()
	{
		super.display();
		System.out.println("Sales Target : "+salesTarget);
		System.out.println("Per Comission : "+perComission);

	}
	
	
	
	
}

 