package student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serdemo {

	public static void main(String[] args) {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java\\myfiles\\data4.txt"));
		try {
			Course[]c;
			c=new Course[3];
			
			c[0]=new Course(11,"dnyanu",11.0);
			c[1]=new Student()
		}

	}

}
