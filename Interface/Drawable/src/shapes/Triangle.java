package shapes;

import custom.Drawable;

public class Triangle implements Drawable {

	int base;
	int height;
	
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void drawshapes() {
		// TODO Auto-generated method stub
		System.out.println("Its Triangle");
		
	}

	@Override
	public double calarea() {
		// TODO Auto-generated method stub
		double area=0.5*base*height;
		return area;
	}

}
