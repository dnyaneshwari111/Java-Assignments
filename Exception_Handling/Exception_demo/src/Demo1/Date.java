package Demo1;
import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;


public class Date  {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			
			System.out.println("Enter day :");
			int day=sc.nextInt();
			System.out.println("Enter month :");
			int month=sc.nextInt();
			System.out.println("Enter year :");
			int year=sc.nextInt();
			
			LocalDate birthdate=LocalDate.of(year,month, day);
			LocalDate currentDate=LocalDate.now();
			
			Period age=Period.between(birthdate, currentDate);
			System.out.println("Age :"+age.getYears()+"years ");
			
			if(age.getYears()>18) {
				System.out.println("Valid");
			}
				else {
					throw new AgeException("Age is less than equal to 18");
			}
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Invalid date or input");
		}
	}
}

