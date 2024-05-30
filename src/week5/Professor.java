package week5;


public class Professor {
	private String name;
	private String dept;
	
	public Professor(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	public String toString() {
		return "이름 = " + this.name + ", 학과 = " + this.dept;
	}
}
