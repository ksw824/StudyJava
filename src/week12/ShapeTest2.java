package week12;

public class ShapeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Measurable m = new MyRect(20,15);
		System.out.println("area=" + m.getArea());
		
		m = new MyCircle(22);
		System.out.printf("area=%.2f, perimeter=%.2f\n",m.getArea(),m.getParameter());
		
		m = new Triangle(4,5,6);
		System.out.printf("area=%.2f, perimeter=%.2f\n",m.getArea(),m.getParameter());
	}

}
