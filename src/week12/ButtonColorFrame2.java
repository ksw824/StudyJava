package week12;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.UIManager;


public class ButtonColorFrame2 extends JFrame implements ActionListener{
	
	private JRadioButton yellow;
	private JRadioButton green;
	
	public ButtonColorFrame2() {
//		try{
//			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
//		} 
//		catch (Exception e) {
//			e.printStackTrace();    
//			}
		setSize(300,150);
		setTitle("Button Color Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		
		yellow = new  JRadioButton("노란색");
		green = new JRadioButton("연두색");
		ButtonGroup colorGroup = new ButtonGroup();
		colorGroup.add(yellow);
		colorGroup.add(green);
		
		JButton button = new JButton("변경");
		button.addActionListener(this);
		
		cPane.add(yellow);
		cPane.add(green);
		cPane.add(button);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(yellow.isSelected())
			(getContentPane()).setBackground(Color.yellow);
		else if(green.isSelected())
			(getContentPane()).setBackground(Color.green);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new ButtonColorFrame2()).setVisible(true);
	}


}
