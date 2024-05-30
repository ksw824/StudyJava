//Week2 예제 
package week2;

import javax.swing.JFrame;

public class FishFrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FishFrame fish = new FishFrame();
		fish.setTitle("Fish Frame Example");
		fish.setSize(400,300);//프레임설정 
		fish.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창 닫힐 때 프로그램도 종
		fish.setVisible(true);
	}

}
