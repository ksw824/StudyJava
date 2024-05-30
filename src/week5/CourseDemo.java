package week5;


public class CourseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("궁극의 자바", "임꺽정");
		Professor professor = new Professor("홍길동","컴공");
		Course course = new Course("자바 ", book, professor);
		System.out.println(course.toString());

	}

}
