package calculation;

import Custom.iCalculator;

public class SimpleCalculator2 implements iCalculator{

	@Override
	public double add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	
}
