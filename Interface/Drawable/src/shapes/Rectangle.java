package shapes;

import custom.Drawable;

public class Rectangle implements Drawable {

	int length,height;
	
	public Rectangle() {
		
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int length, int height) {
		
		this.length = length;
		this.height = height;
	}
	@Override
	public void drawshapes() {
		// TODO Auto-generated method stub
		System.out.println("its Recatngle ");

	}
	@Override
	public double calarea() {
		// TODO Auto-generated method stub
		double area=length*height;
		return area;

	}

}
