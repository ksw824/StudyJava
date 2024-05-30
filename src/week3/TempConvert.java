//Week3 실습1 
package week3;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("변환할 온도를 입력하시오:");
		String temp = input.nextLine();
		if (temp.indexOf("F") == temp.length() -1 ||temp.indexOf("f") == temp.length() -1  ) {
		
			int tempNumber1 = Integer.parseInt(temp.substring(0, temp.length()-1));
			System.out.println("화씨 " + temp.substring(0, temp.length()-1)+"도는 섭씨" +Math.round((tempNumber1-32)/1.8)+"입니다.");
		}
		else if(temp.indexOf("C") == temp.length() -1||temp.indexOf("c") == temp.length() -1 ) {
			int tempNumber2 = Integer.parseInt(temp.substring(0, temp.length()-1));
			System.out.println("섭씨 " +temp.substring(0, temp.length()-1)+"도는 화씨 "+Math.round((tempNumber2*1.8)+32)+"도입니다.");
		}
	}
}