package week5;
import javax.swing.JOptionPane;

public class CreateBlueBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String drawer = JOptionPane.showInputDialog("직사각형의 크기를 입력하세요(가로x세로):");
		int width = Integer.parseInt(drawer.substring(0, 3));
		int height = Integer.parseInt(drawer.substring(4, 7));
		BlueBoxFrame A = new BlueBoxFrame(width, height);
		A.setVisible(true);
		
	}

}
