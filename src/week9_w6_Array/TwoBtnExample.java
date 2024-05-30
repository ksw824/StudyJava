package week9_w6_Array;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TwoBtnExample extends JFrame{
	private JButton btnRed;
	private JButton btnYellow;
	
	public class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnRed)
				(getContentPane()).setBackground(Color.red);
			else if(e.getSource()==btnYellow)
				(getContentPane()).setBackground(Color.yellow);
		}
	}
	public TwoBtnExample() {
		setSize(300,150);
		setTitle("Two Button Exmaple");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cPane = getContentPane();
		cPane.setBackground(Color.GREEN);
		cPane.setLayout(new FlowLayout());
		JLabel label = new JLabel("버튼을 누르세요");
		btnRed = new JButton("빨간색");
		btnYellow = new JButton("노란색");
		
		ButtonListener listener = new ButtonListener();
		btnRed.addActionListener(listener);
		btnYellow.addActionListener(listener);
		cPane.add(label);
		cPane.add(btnRed);
		cPane.add(btnYellow);
	}
	public static void main(String[] args) {
		(new TwoBtnExample()).setVisible(true);
	}
}
