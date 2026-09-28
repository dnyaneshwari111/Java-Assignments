package library;
import java.util.Date;
import library.Book;
import library.eBook;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		eBook e=new eBook(101,"Java",550.5f,"www.expl.com",5.5);
		e.display();
		
		PaperBook pb=new PaperBook(102,"c++",300.5f,450,new Date());
		pb.display();
		
		System.out.println("Paper Book-----");
		pb.display();
		System.out.println("e Book-----");
		e.display();
		
	}

}
