package office;
import office.SalaryComparator;
import office.Employee;

import java.util.TreeSet;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Employee>emp=
				new TreeSet<>(
				(e1,e2) ->Double.compare(e1.salary, e2.salary));
		
		emp.add(new Employee(10,"Dnyanu",500000));
		emp.add(new Employee(11,"Arya",60000));
		emp.add(new Employee(12,"manu",80000));
		emp.add(new Employee(13,"tanu",400000));
		emp.add(new Employee(14,"aanu",300000));
		
		for(Employee e:emp) {
			System.out.println(e);
		}
		System.out.println();
	}

}
