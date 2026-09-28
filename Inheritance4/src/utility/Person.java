package utility;

public class Person {
	
	String name;
	int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
		
	public Person() {
		
	}

	public	void display()
	{
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

	
	


