package week7;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int count = input.nextInt();
		int sum = 0;
		int max = 0;
		int min = 0;

		int[] num = new int[count];
		Scanner input2 = new Scanner(System.in);
		System.out.print(count + "개의 양의 정수를 입력하시오: ");
		for(int i = 0; i< count; i++) {
			num[i] = input2.nextInt();
			sum += num[i];
			
		}
		double average = (double)sum/count;
		System.out.printf("평균값=%.2f",average);
		System.out.println();
		for(int i = 0; i<count; i++) {
			if(max==0) {
				max+=num[i];
			}
			if(max<num[i])
				max=num[i];
		}
		for(int i = 0; i<count; i++) {
			if(min==0) {
				min+=num[i];
			}
			if(min>num[i])
				min=num[i];
		}
		System.out.println("최댓값="+max);
		System.out.println("최솟값="+min);
		
	}
}
