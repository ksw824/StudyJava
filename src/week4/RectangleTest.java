//Week4 에제  
package week4;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		
		rec1.setWidth(25);
		rec1.setHeight(20);
		System.out.println("rec1의 면적=" + rec1.getArea());
		Rectangle rec2 = new Rectangle(12,15);
		rec2.setHeight(18);
		System.out.println("rec2의 면적=" + rec2.getArea());
	}

}
