package student;

import java.io.Serializable;

public class Person implements Serializable  {
	private int name;
	private String dob;
	public Person(int name, String dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display()
	{
		System.out.println("Name "+name);
		System.out.println("DOB "+dob);
		
		
	}
}
	