package student;

import java.io.Serializable;

public class Date implements Serializable {
	int d,m,y;

	public Date(int d, int m, int y) {
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}

	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display()
	{
		System.out.println("Date :"+d+"/"+m+"/"+y );
	}

}
