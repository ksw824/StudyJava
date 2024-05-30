package midterm_Practice;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ChoiceAndRadio extends JFrame {
	public ChoiceAndRadio() {
		setSize(350,150);
		setTitle("상품 선택");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		Container cPane = getContentPane();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.setLayout(new GridLayout(4,0));
		panel1.add(new JLabel("상품 선택"));
		panel1.add(new JCheckBox("사과", true));
		panel1.add(new JCheckBox("배"),true);
		panel1.add(new JCheckBox("감"));
		panel2.setLayout(new GridLayout(4,0));
		panel2.add(new JLabel("결제 방법"));
		JRadioButton rbutton1 = new JRadioButton("신용카드",true);
	
		JRadioButton rbutton2 = new JRadioButton("현금");

		JRadioButton rbutton3 = new JRadioButton("무통장 입금");


		ButtonGroup group = new ButtonGroup();
		group.add(rbutton1);
		group.add(rbutton2);
		group.add(rbutton3);
		
		panel2.add(rbutton1);
		panel2.add(rbutton2);
		panel2.add(rbutton3);
		cPane.add(panel1, BorderLayout.WEST);
		cPane.add(panel2, BorderLayout.CENTER);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChoiceAndRadio().setVisible(true);
	}

}
