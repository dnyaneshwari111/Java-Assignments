package student;

public class Student extends Person {
	private int PRN;
	private String curname;
	transient int age;
	public Student(int name, String dob, int pRN, String curname, int age) {
		super(name, dob);
		PRN = pRN;
		this.curname = curname;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int name, String dob) {
		super(name, dob);
		// TODO Auto-generated constructor stub
	}
	
	public void display()
	{
		System.out.println("PRN NUMBER :"+PRN);
		System.out.println("Course Name :"+curname);
		System.out.println("age :"+age);
		
	}
}

	