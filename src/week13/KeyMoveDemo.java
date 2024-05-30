package week13;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyMoveDemo extends JFrame {
	public static final int NUM = 10;
	private JButton[] list;
	private int index;
	
	private class MyPanel extends JPanel{
		public MyPanel() {
			setLayout(new GridLayout(0,NUM));
			list = new JButton[NUM*NUM];
			for(int i = 0; i<list.length; i++) {
				list[i] = new JButton();
				list[i].setBackground(Color.white);
				list[i].setEnabled(false);
				add(list[i]);
			}
			index = (int)(Math.random()*(NUM*NUM));
			list[index].setBackground(Color.blue);
			
			this.setFocusable(true);
			this.requestFocus();
			
			addKeyListener(new KeyAdapter() {
				
				public void keyPresseed(KeyEvent e) {
					list[index].setBackground(Color.white);
					switch(e.getKeyCode()){
					case KeyEvent.VK_UP : 
						if(index<NUM)
							index += NUM*NUM;
						index -= NUM;
						break;
					case KeyEvent.VK_DOWN : 
						index = (index+NUM) % (NUM*NUM);
						break;
					case KeyEvent.VK_RIGHT :
						index++;
						if(index % NUM ==0)
							index -= NUM;
						break;
					case KeyEvent.VK_LEFT :
						if(index %NUM ==0)
							index += NUM;
						index --;
						break;
					}
					list[index].setBackground(Color.blue);
				}
			});
		}
	}
	
	public KeyMoveDemo() {
		setSize(400,400);
		setTitle("Key Move Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new MyPanel());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new KeyMoveDemo()).setVisible(true);
	}

}
//package week13;
//
//import java.awt.Color;
//import java.awt.GridLayout;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.UIManager;
//
//public class KeyMoveDemo extends JFrame {
//
//	public static final int NUM = 10;
//	private JButton[] list;
//	private int index;
//
//	private class MyPanel extends JPanel {
//		public MyPanel() {
//
//			setLayout(new GridLayout(0, NUM));
//			list = new JButton[NUM * NUM];
//			for (int i = 0; i < list.length; i++) {
//
//				list[i] = new JButton();
//				list[i].setBackground(Color.white);
//				list[i].setEnabled(false);
//				add(list[i]);
//			}
//
//			index = (int) (Math.random() * (NUM * NUM));
//			list[index].setBackground(Color.blue);
//
//			this.setFocusable(true);
//			this.requestFocus();
//
//			addKeyListener(new KeyAdapter() {
//				@Override
//				public void keyPressed(KeyEvent e) {
//					list[index].setBackground(Color.white);
//					switch (e.getKeyCode()) {
//					case KeyEvent.VK_UP:
//						if (index < NUM)
//							index += NUM * NUM;
//						index -= NUM;
//						break;
//					case KeyEvent.VK_DOWN:
//						index = (index + NUM) % (NUM * NUM);
//						break;
//					case KeyEvent.VK_RIGHT:
//						index++;
//						if (index % NUM == 0)
//							index -= NUM;
//						break;
//					case KeyEvent.VK_LEFT:
//						if (index % NUM == 0)
//							index += NUM;
//						index--;
//						break;
//					}
//
//					list[index].setBackground(Color.blue);
//				}
//			});
//		}
//	}
//
//	public KeyMoveDemo() {
//		
//		try {
//			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		setSize(400, 400);
//		setTitle("Key Move Example");
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		add(new MyPanel());
//	}
//
//	public static void main(String[] args) {
//
//		(new KeyMoveDemo()).setVisible(true);
//
//	}
//}
