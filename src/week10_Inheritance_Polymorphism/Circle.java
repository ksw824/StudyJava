package week10_Inheritance_Polymorphism;
//실습1
public class Circle {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "반지름이 "+this.radius+"인 원입니다.";
	}

	public int getRadius() {
		return this.radius;
	}

}
