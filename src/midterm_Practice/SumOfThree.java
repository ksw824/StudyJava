package midterm_Practice;

import java.util.Scanner;

public class SumOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		for(int i = 1; i<=10;i++) {
			if(i%3==0)
				sum+=i;
		}
		System.out.println(sum);
	}

}
