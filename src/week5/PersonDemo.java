package week5;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("홍 길도", 28);
		Person p2 = new Person("홍", "길도", 28);
		Person p3 = new Person("홍 길동", 28);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("p1.equals(p2) : "+p1.equals(p2));
		System.out.println("p1.equals(p3) : "+p1.equals(p3));
		System.out.println("p2.equals(p3) : "+p2.equals(p3));
		

	}

}
