package Divisor;

import java.io.File;

public class DivisorMain {

	public static void main(String[] args) {
		DivisorThread t1=new DivisorThread(30);
		DivisorThread t2=new DivisorThread(15);
		DivisorThread t3=new DivisorThread(100);
		
		System.out.println("files created successfully");
		System.out.println(new File("divisor.txt").getAbsolutePath());
		t1.start();
		t2.start();
		t3.start();
		System.out.println("file ended");

	}

}
