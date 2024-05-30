package week10_Inheritance_Polymorphism;
//실습1
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(10);
		ColoredCircle cc = new ColoredCircle(20,"빨간색");
		
		System.out.println(c);
		System.out.println(cc);
	}

}
