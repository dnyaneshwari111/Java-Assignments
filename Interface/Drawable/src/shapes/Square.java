package shapes;


import custom.Drawable;

public class Square implements Drawable {

	int side;
	
	
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public void drawshapes() {
		// TODO Auto-generated method stub
		System.out.println("Its square");
	}

	@Override
	public double calarea() {
		// TODO Auto-generated method stub
		double area=side*side;
		return area;

	}

}
