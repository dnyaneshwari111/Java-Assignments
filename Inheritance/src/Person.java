
public class Person {
	
	String name;
	int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
		
	public Person() {
		// TODO Auto-generated constructor stub
		name="Unknown";
		age=0;
	}

	public	void display()
	{
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);

	}
	
}

	
	


