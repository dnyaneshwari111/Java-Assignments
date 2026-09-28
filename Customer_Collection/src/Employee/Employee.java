package Employee;

public class Employee {

	int id;
	String name;
	double Salary;
	String dept;
	public Employee(int id, String name, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", dept=" + dept + "]";
	}
	
	
}

