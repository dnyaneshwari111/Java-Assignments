package ColletnStudent;
import java.util.HashSet;
import java.util.Set;

public class StudentsetMain {

	public static void main(String[] args) {
		Set <Student> std = new HashSet<>();
		std.add(new Student(1, "Aarya", "Kolhapur", 90.00));
		std.add(new Student(2, "Rucha", "Pune", 34.00));
		std.add(new Student(3, "Nano", "Nagpur", 87.00));
		std.add(new Student(4, "Puja", "Nashik", 89.00));
		std.add(new Student(5, "Aditi", "Mumbai", 70.00));
		std.add(new Student(6, "Sakshi", "Pune", 97.00));
		std.add(new Student(7, "Bhumi", "Kolhapur", 50.00));
		std.add(new Student(8, "Khushi", "Delhi", 67.00));
		std.add(new Student(9, "Aaryan", "karad", 73.00));
		std.add(new Student(10, "Disha", "Kolhapur", 99.00));
		
		for(Student s : std) {
			System.out.println(s);
		}

	}

}
