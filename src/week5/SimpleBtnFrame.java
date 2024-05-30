package week5;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleBtnFrame extends JFrame{
	public SimpleBtnFrame() {
		setSize(300,150);
		setTitle("Simple Button Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setBackground(Color.green);
		cPane.setLayout(new FlowLayout());
		JLabel label = new JLabel("버튼을 누르세요"); //컴포넌
		label.setFont(new Font("Serif",Font.BOLD, 18));
		JButton btn = new JButton("버튼"); // 컴포넌트 
		cPane.add(label);
		cPane.add(btn);
		
		
		
	}
	public static void main(String[] args) {
		new SimpleBtnFrame().setVisible(true);
	}

}
