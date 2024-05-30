package week12;

public class MyRect implements Measurable {
	private int width, height;
	public MyRect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}

}
