package shapes;

import custom.Drawable;

public class Circle implements Drawable {
	
	double radius;
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public void drawshapes() {
		// TODO Auto-generated method stub
		System.out.println("This is Circle");
	}

	@Override
	public double calarea() {
		// TODO Auto-generated method stub
		double area=pi*radius*radius;
		return area;
	}

}
