package library;

public class Book {

	private int Bookid;
	private String title;
	private float price;
	
	
	Book()
	{
		Bookid=0;
		title="";
		price=0.0f;
		
	}
	
	Book(int Bookid,String title,float price){
		this.Bookid=Bookid;
		this.price=price;
		this.title=title;
		
	}
	
	public void display()
	{
		System.out.println("Book id "+Bookid);
		System.out.println("title "+title);
		System.out.println("Price "+ price);
	}

}
