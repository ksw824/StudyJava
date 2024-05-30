package week6;

import javax.swing.JOptionPane;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computerValue = (int)(Math.random()*6) +1;
		String myDice;
		for(int count =0;count < 6;count++) {
			if(count==0) {
				myDice = JOptionPane.showInputDialog("주사위의 값(1-6)을 입력하시오.");
			}else {
				myDice = JOptionPane.showInputDialog("틀렸습니다. 다시 입력하시오.");
			}
			int myValue = Integer.parseInt(myDice);
			if(myValue==computerValue) {
				JOptionPane.showMessageDialog(null, "축하합니다. "+(count+1)+"번만에 맞추셨습니다!" );
				break;
			}
		}
	}
}
