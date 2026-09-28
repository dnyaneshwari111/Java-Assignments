package customer;

public class RegisteredCustomer extends Customer {
	private int regno;

	public RegisteredCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	

	public RegisteredCustomer(String name, String emil, int contactno, int regno) {
		super(name, emil, contactno);
		this.regno = regno;
	}








	public void display()
	{
		System.out.println("Registered customer number :"+ regno);
	}

}
