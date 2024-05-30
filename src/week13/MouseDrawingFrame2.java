////package week13;
////
////import java.awt.Color;
////import java.awt.Graphics;
////import java.awt.Point;
////import java.awt.event.MouseAdapter;
////import java.awt.event.MouseEvent;
////
////import javax.swing.JFrame;
////import javax.swing.JPanel;
////
////public class MouseDrawingFrame2 extends JFrame {
////	private Point[] points;
////	private int count = 0;
////	private class MyListener extends MouseAdapter {
////		public void mouseDragged(MouseEvent e) { 
////			if (count < points.length) {
////				points[count++] = new Point(e.getX(), e.getY());
////				repaint(); 
////			}
////		}
////		public void mouseReleased(MouseEvent e) {
////			if (count < points.length)
////				points[count++] = new Point(-1, -1);
////		}
////		
////	}
////	private class MyPanel extends JPanel { 
////		public MyPanel() {
////			setBackground(Color.yellow);
////			MyListener listener = new MyListener(); 
////			addMouseListener(listener); 
////			addMouseMotionListener(listener);
////		}
////		@Override
////		protected void paintComponent(Graphics g) { 
////			super.paintComponent(g);
////			Graphics2D g2 = (Graphics2D)g; 
////			g2.setColor(Color.blue); 
////			g2.setStroke(new BasicStroke(3));
////			for (int i=0; i<count-1; i++)
////					if (points[i].x >= 0 && points[i+1].x >= 0)
////		        g2.drawLine(points[i].x, points[i].y,
////		                points[i+1].x, points[i+1].y);
////	public static void main(String[] args) {
////		// TODO Auto-generated method stub
////
////	}
////
////}
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
//
