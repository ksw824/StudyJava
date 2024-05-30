package week10_Inheritance_Polymorphism;
//실습1
public class ColoredCircle extends Circle{
	private String color;
	public ColoredCircle(int radius,String color) {
		super(radius);
		this.color = color;
	}
	public String toString() {
		return "반지름이 " + super.getRadius() +"인 " + this.color +" 원입니다.";
	}
}
