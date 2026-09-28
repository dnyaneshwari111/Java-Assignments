package app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import staff.Administration;
import staff.Programmer;
import staff.SalesManager;
import utility.Employee;

public class SerDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Java\\myfiles\\data2.txt"));
		try {
			Employee[] allemps;
			allemps = new Employee[3];
			allemps[0] = new SalesManager("Puja", 31, 12, 500000.00, 2.0, 1000.0);
			allemps[1] = new Programmer("Dyna", 32, 11, 600000.00, "ERP", 6, 5000.0);
			allemps[2] = new Administration("Rucha", 33, 15, 700000.00, 800000.00);

			for (Employee e : allemps) {
				oos.writeObject(e);
			}
			System.out.println("Objects written");

		} catch (Exception ex) {
			System.out.println(ex.toString());
		} finally {
			oos.close();
		}
	}
}
