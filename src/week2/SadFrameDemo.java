//Week2 실습1
package week2;

import javax.swing.JFrame;

public class SadFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SadFrame sad = new SadFrame();
		sad.setTitle("Fish Frame Example");
		sad.setSize(400,300);//프레임설정 
		sad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창 닫힐 때 프로그램도 종
		sad.setVisible(true);
	}

}
