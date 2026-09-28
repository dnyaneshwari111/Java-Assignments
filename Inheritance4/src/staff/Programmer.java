package staff;
import utility.Employee;

public class Programmer extends Employee {
	
	private String ProjectTitle;
	private int extraHours;
	private double chargesPerHr;

	public Programmer()
	{
		super();
	}
	
	public Programmer(String name, int age, int empId, double BasicSalary,double salesTarget,String ProjectTitle,int extraHours,double chargesPerHr) {
		super(name,age,empId,BasicSalary);
		this.ProjectTitle = ProjectTitle;
		this.extraHours = extraHours;
		this.chargesPerHr=chargesPerHr;
	}


	@Override
	public String toString() {
		return super.toString()+"Programmer [ProjectTitle=" + ProjectTitle + ", extraHours=" + extraHours + ", chargesPerHr="
				+ chargesPerHr + "]";
	}

	public	void display()
	{
		super.display();
		System.out.println("Extra Hours : "+extraHours);
		System.out.println("Project Title : "+ProjectTitle);
		System.out.println("Charges per Hrs"+chargesPerHr);

	}
	
	
}

 