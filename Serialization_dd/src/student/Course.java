package student;

import java.io.Serializable;

public class Course extends Student implements Serializable {

	private int curid;
	private String curname;
	private double fees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int curid, String curname, double fees) {
		super();
		this.curid = curid;
		this.curname = curname;
		this.fees = fees;
	}
	
	public void display() {
		System.out.println("Course id :"+curid);
		System.out.println("Couse name:"+curname);
		System.out.println("Fees :"+fees);
	}
	
	
}


