package library;

public class eBook extends Book {
	private String downloadUrl;
	private double sizeinmb;
	
	public eBook() {
		super();
		downloadUrl="";
		sizeinmb=0.0;
	}

	public eBook(int Bookid,String title,float price,String downloadUrl, double sizeinmb) {
		super(Bookid,title,price);
		this.downloadUrl = downloadUrl;
		this.sizeinmb = sizeinmb;
	}
	
	public void display()
	{
		super.display();
		System.out.println("download url"+downloadUrl);
		System.out.println("size in mb"+sizeinmb);
		
	}
}
