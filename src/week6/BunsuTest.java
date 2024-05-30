package week6;

public class BunsuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bunsu b1 = new Bunsu(3,5);
		Bunsu b2 = new Bunsu(1,2);
		//b1=b1.times(b2);
		b1.times(b2);
		System.out.println("b1 = "+b1.toString());
	}

}
