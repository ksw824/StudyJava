package week12;

public class MyCircle implements Measurable {
	public static final double PI = 3.14159;
	private int radius;
	public MyCircle(int radius) {
		this.radius=radius;
	}
	
	@Override
	public double getArea() {
		return PI*radius*radius;
	}

	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}
	public double getDiameter() {
		return 2*radius;
	}
}
