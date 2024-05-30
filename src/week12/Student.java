package week12;

import java.util.Arrays;

public class Student implements Comparable{
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	public void writeInfo() {
		System.out.println(name+" : " + gpa);
	}
	public int compareTo(Object obj) {
		if(obj != null && obj instanceof Student) {
			Student s = (Student)obj;
			if(gpa>s.gpa)
				return -1;
			else if (gpa<s.gpa)
				return 1;
			else 
				return 0;
		}else
			return -1;
	}
	
	public static void main(String[] args) {
		Student[] students = new Student[4];
		students[0] = new Student("박철수", 2.23);
		students[1] = new Student("이철수", 1.23);
		students[2] = new Student("김철수", 4.23);
		students[3] = new Student("표철수", 3.23);
		
		Arrays.sort(students);
		for(Student s : students)
			s.writeInfo();
	}
}
