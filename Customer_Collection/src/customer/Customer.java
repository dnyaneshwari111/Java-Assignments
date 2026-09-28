package customer;

public class Customer {
	private String name;
	private String emil;
	private int contactno;
	
	
		public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


		public Customer(String name, String emil, int contactno) {
		super();
		this.name = name;
		this.emil = emil;
		this.contactno = contactno;
	}


		public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Email id :"+emil);
		System.out.println("Contact No :"+contactno);
	}
	

}
