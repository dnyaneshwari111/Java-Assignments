package library;
import java.util.Date;
public class PaperBook extends Book {
	private int numofpages;
	private Date DateOfPublication;
	
	public PaperBook(){
		super();
		numofpages=0;
		DateOfPublication=new Date();
		
	}
	
	public PaperBook(int Bookid,String title,float price,int numofpages,Date DateOfPublication){
		super(Bookid,title, price);
		this.DateOfPublication=DateOfPublication;
		this.numofpages=numofpages;
		
	}
	
	public void display() {
		super.display();
		System.out.println("Num of pages "+numofpages);
		System.out.println("Date of pulication"+DateOfPublication);
		
	}
}