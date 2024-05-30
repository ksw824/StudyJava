package midterm_Practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleButtonFrameDemo extends JFrame {
	public SimpleButtonFrameDemo() {
		setSize(300,150);
		setTitle("Simple Button");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setBackground(Color.GREEN);
		cPane.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("버튼을Gets누르세요");
//		JLabel label1 = new JLabel("                    ");
		label.setFont(new Font("Serif", Font.ITALIC,20));
		JButton button = new JButton("버튼");
		cPane.add(label);
		
		cPane.add(button);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleButtonFrameDemo().setVisible(true);
	}

}
