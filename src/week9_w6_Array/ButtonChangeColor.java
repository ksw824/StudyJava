//package week9_w6_Array;
//
//import java.awt.Color;
//import java.awt.Container;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//import week9_w6_Array.LightOnOffExample.BtnListener;
//
//public class ButtonChangeColor extends JFrame{
//	private JButton btnRed;
//	private JButton btnYellow;
//	
//	public class ButtonListener implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//			if(e.getSource()==btnRed)
//				(getContentPane()).setBackground(Color.red);
//			else if(e.getSource()==btnYellow)
//				(getContentPane()).setBackground(Color.yellow);
//		}
//	}
//	public ButtonChangeColor() {
//		setSize(380,250);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setTitle("Light On/Off Example");
//		
//		Container cPane = getContentPane();
//		cPane.setLayout(new FlowLayout());
//		JButton button = new JButton("켜기");
//		button.addActionListener(new BtnListener());
//		cPane.add(button);
//	
//		
//		ButtonListener BtnListener = new ButtonListener();
//		btnRed.addActionListener(BtnListener);
//		btnYellow.addActionListener(BtnListener);
//		cPane.add(label);
//		cPane.add(btnRed);
//		cPane.add(btnYellow);
//	}
//	public static void main(String[] args) {
//		(new TwoBtnExample()).setVisible(true);
//	}
//}
