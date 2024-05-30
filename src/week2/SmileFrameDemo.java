//Week2 예제 
package week2;

import javax.swing.JFrame;

public class SmileFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmileFrame smile = new SmileFrame();
		smile.setTitle("Fish Frame Example");
		smile.setSize(400,300);//프레임설정 
		smile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창 닫힐 때 프로그램도 종
		smile.setVisible(true);
	}

}
