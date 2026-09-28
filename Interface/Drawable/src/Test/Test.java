package Test;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;
import custom.Drawable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable[] shapes=new Drawable[4];
		
		shapes[0]=new Rectangle(4,8);
		shapes[1]=new Circle(4);
		shapes[2]=new Square(2);
		shapes[3]=new Triangle(7,8);
		
				
				for(Drawable d: shapes)
				{
					d.drawshapes();
					System.out.println("Area:" + d.calarea());
					System.out.println();
				}
		

	}

}
