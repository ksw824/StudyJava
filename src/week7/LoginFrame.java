//package week7;
//import java.awt.Container;
//import java.awt.FlowLayout;
//import java.awt.Font;
//import java.awt.GridLayout;
//
//import javax.swing.JButton;
//import javax.swing.JCheckBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//public class LoginFrame extends JFrame {
//
//	public LoginFrame() {
//		setSize(320,150);
//		setTitle("Login Demo");
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		Container cPane= getContentPane();
//		cPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
//	
//		Font font = new Font("Serif", Font.PLAIN, 15);
//		JPanel panel = new JPanel();
//		JLabel label1 = new JLabel(" 아이디");
//		JLabel label2 = new JLabel(" 비밀번호");
//		JButton btn1 = new JButton("로그인"); // 컴포넌트
//		JButton btn2 = new JButton("취소"); // 컴포넌트
//		JTextField f1 = new JTextField();
//		JTextField f2 = new JTextField();
//		JCheckBox c1 = new JCheckBox("아이디 저장",true);
////		btn1.setSize(20,10);
////		btn2.setSize(20,20);
//		label1.setFont(font);
//		label2.setFont(font);
//		btn1.setFont(font);
//		btn1.setFont(font);
//		btn2.setFont(font);
//		
//		
//		panel.setLayout(new GridLayout(0,2));
//		panel.add(label1);
//		panel.add(f1);
//		panel.add(label2);
//		panel.add( f2);
//		panel.add(new JLabel());
//		panel.add(c1);
//		panel.add(btn1);
//		panel.add(btn2);
//		
//		cPane.add(panel);
//		
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new LoginFrame().setVisible(true);
//	}
//
//}
package week7;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	public LoginFrame() {
		setSize(300, 200);
		setTitle("Login Page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cPane = getContentPane();

	
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		
		
		JPanel idPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        idPanel.add(new JLabel("아이디"));
        panel.add(idPanel);
        
        
		panel.add(new JTextField(10));
		
		
		JPanel passPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		passPanel.add(new JLabel("비밀번호"));
        panel.add(passPanel);
        
        
		panel.add(new JTextField(10));
		
		
		panel.add(new JLabel(""));
		panel.add(new JCheckBox("아이디 저장", true));
		
		
		panel.add(new JButton("로그인"));
		panel.add(new JButton("취소"));
		
		

		cPane.add(panel, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		(new LoginFrame()).setVisible(true);
	}
}