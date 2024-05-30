package week5;

public class Person {
	private String firstname;
	private String lastname;
	private int age;
	
	public Person(String fullname, int age) {
		firstname = fullname.substring(0,1);
		lastname = fullname.substring(1);
		this.age = age;
	}
	public Person(String firstname, String lastname, int age){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public String toString() {
		return "이름="+this.firstname+this.lastname+", 나이="+this.age;
	}
	public boolean equals(Person p1) {
		return firstname.equals(p1.firstname) && lastname.equals(p1.lastname) && this.age == p1.age;
	}
	
}
