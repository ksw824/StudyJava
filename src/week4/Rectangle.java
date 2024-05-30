//Week4 예제	
package week4;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		this(0,0);
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;	
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getArea() {
		int Area = width*height;
		return Area;
	}
	
}
