package week5;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SendImfoFrame extends JFrame{
	public SendImfoFrame() {
		setSize(450,150);
		setTitle("Yes/No Button Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setBackground(Color.green);
		cPane.setLayout(new FlowLayout());
		JButton btn1 = new JButton("yes"); // 컴포넌트
		JButton btn2 = new JButton("no"); // 컴포넌트 
		JLabel label = new JLabel("정보를 보내시겠습니"); //컴포넌
		cPane.add(btn1);
		cPane.add(btn2);
		label.setFont(new Font("Serif",Font.BOLD, 30));
		label.setForeground(Color.BLUE);
		
		cPane.add(label);
	
		
		
		
	}
	public static void main(String[] args) {
		new SendImfoFrame().setVisible(true);
	}

}
