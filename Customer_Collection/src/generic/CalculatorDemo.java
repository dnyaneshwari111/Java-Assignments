package generic;

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Myclass <Integer>cal=new Myclass(10,20);
		System.out.println("Addtion of Integer values :"+cal.add() );
		
		Myclass <Double>cal1=new Myclass(10.0,28.9);
		System.out.println("Addtion of Float values :"+cal1.add() );
		

	}

}
