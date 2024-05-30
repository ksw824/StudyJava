package week12;

public class Triangle implements Measurable {
	private int a,b,c;
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double s = (a+b+c)/2.0;
		double m = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return m;
	}

	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

}
