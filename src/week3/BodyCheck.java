//Week3 실습2
package week3;

import javax.swing.JOptionPane;
public class BodyCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String heightString = JOptionPane.showInputDialog("키를 입력하시오(cm)");
		int height = Integer.parseInt(heightString);
		String weightString = JOptionPane.showInputDialog("체중을 입력하시오(kg)");
		int weight = Integer.parseInt(weightString);	
		String bmi = (float)(weight /(0.0001*height*height)) + "";
		
		
		JOptionPane.showMessageDialog(null, "키 = " + height + "cm, 체중 = " +weight+"kg, BMI = " + bmi.substring(0, 5) + "입니다.");
		System.exit(0);
	}


}