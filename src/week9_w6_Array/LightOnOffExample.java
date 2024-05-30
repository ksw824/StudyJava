package week9_w6_Array;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LightOnOffExample extends JFrame{
	private boolean isOn = false;
	
	public LightOnOffExample() {
		setSize(380,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("버튼텍스트 예제");
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		cPane.setBackground(Color.white);
		JButton button = new JButton("버튼을 누르시오");
		button.addActionListener(new BtnListener());
		cPane.add(button);
	}
//	public void paint(Graphics g) {
//		super.paint(g);
//		if(isOn)
//			g.setColor(Color.yellow);
//		else
//			g.setColor(Color.darkGray);
//		g.fillRect(50,100,80,100);
//		g.fillRect(150,100,80,100);
//		g.fillRect(250,100,80,100);
//		System.out.println(isOn);
//	}
	private class BtnListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			isOn = !isOn;
			JButton btn = (JButton)e.getSource();
			btn.setText(isOn ? "버튼이 눌렸습니다" : "버튼을 누르시오");
			if(isOn)
				(getContentPane()).setBackground(Color.DARK_GRAY);
			else
				(getContentPane()).setBackground(Color.white);
		}
	}
//	private class BtnListener implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//			isOn = !isOn;
//			JButton btn = (JButton)e.getSource();
//			btn.setText(isOn ? "끄기" : "켜기");
//			repaint();
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LightOnOffExample().setVisible(true);
	}

}
