package ColletnStudent;

import java.util.Objects;

public class Student {

	private int studentid;
	private String name;
	private String city;
	private double Percentage;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentid, String name, String city, double Percentage) {	
		super();
		this.studentid = studentid;
		this.name = name;
		this.city = city;
		this.Percentage = Percentage;
		
	}
	
	@Override
    public String toString() {
        return "Student [id=" + id +
               ", name=" + name +
               ", city=" + city +
               ", percentage=" + percentage + "]";
    }
	
	@Override
	public int hashCode() {
		int code=0;
		if(this.Percentage >=90) {
			code=10;	
		}
		else if(this.Percentage >70 && this.Percentage<90) {
			code=20;
		}else if(this.Percentage >50 && this.Percentage<70) {
			code=30;
		}else if(this.Percentage<50) {
			code=40;
		}
		return code;
		//return Objects.hash(Integer.valueOf(Percentage), city, name, Integer.valueOf(studentid));
	}
	@Override
	public boolean equals(Object obj)boolean flag = false;
    if (obj instanceof Student) {
    	Student std = (Student)obj;
    	if(this.id == std.id && this.name.equals(std.name) && this.city.equals(std.city));
    		flag = true;
    
    }
	return flag;
}





