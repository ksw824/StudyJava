package week7;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelDemo extends JFrame{
	public PanelDemo() {
		setSize(320,370);
		setTitle("Panel Demo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(280,150));
		panel1.setBackground(Color.green);
		
		Font font = new Font("Serif", Font.PLAIN,50);
		JLabel label1 = new JLabel("Green Pannel");
		label1.setFont(font);
		panel1.add(label1);
	
		panel1.add(new JCheckBox("사과",true));
		panel1.add(new JCheckBox("오렌지",true));
		panel1.add(new JTextField(8));
		
		JPanel panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(280,150));
		panel2.setBackground(Color.yellow);
		
		
		JLabel label2 = new JLabel("Yellow Pannel");
		label2.setFont(font);
		panel2.add(label2);

		JRadioButton rb1 = new JRadioButton("여성");
		JRadioButton rb2 = new JRadioButton("남성", true);
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		panel2.add(rb1);
		panel2.add(rb2);
		panel2.add(new JTextArea(3,10));
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		cPane.add(panel1);
		cPane.add(panel2);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		new PanelDemo().setVisible(true);
	}

}
