//Week3 실습 
package week3;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner temp = new Scanner(System.in);
		System.out.println("화씨 온도를 입력하시오: ");
		int sub = temp.nextInt();
		double b = (sub-32)/1.8;
		System.out.println("화씨 " + sub + "도는 섭씨 "+ (int)b +"입니다.");
		
	}

}
