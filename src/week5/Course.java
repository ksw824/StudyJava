package week5;


public class Course {
	private String title;
	private Book textbook;
	private Professor lecturer;
	
	public Course(String title, Book textbook, Professor lecturer) {
		this.title = title;
		this.textbook = textbook;
		this.lecturer = lecturer;
	}
	public String toString() {
		return "교과목 이름 = " + this.title + "\n담당교수 = " + lecturer.toString() + "\n교재 = "+
	textbook.toString();
	}
}
