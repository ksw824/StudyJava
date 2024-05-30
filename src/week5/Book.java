package week5;


public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author= author;
	}
	public String toString() {
		return "제목 = " + this.title + ", 저자 = " + this.author;
	}
}
