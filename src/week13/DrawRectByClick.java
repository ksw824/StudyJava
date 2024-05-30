package week13;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawRectByClick extends JFrame{
	private class MyPanel extends JPanel{
		private Point[] points;
		private int count = 0;
		
        public MyPanel() {
            points = new Point[20];

            this.addMouseListener(new MouseListener() {
                public void mousePressed(MouseEvent e) {
                    if (count < 20) {
                        points[count] = new Point(e.getX(), e.getY());
                        count++;
                        repaint();
                    }
                }

                @Override
                public void mouseClicked(MouseEvent e) {}

                @Override
                public void mouseReleased(MouseEvent e) {}

                @Override
                public void mouseEntered(MouseEvent e) {}

                @Override
                public void mouseExited(MouseEvent e) {}
            });
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));

            for (int i = 0; i < count; i++) {
                switch (i % 3) {
                    case 0:
                        g2.setColor(Color.RED);
                        break;
                    case 1:
                        g2.setColor(Color.GREEN);
                        break;
                    case 2:
                        g2.setColor(Color.BLUE);
                        break;
                }
                g2.fillRect(points[i].x, points[i].y, 30, 30);
            }
        }
    }
	public DrawRectByClick() {
		setSize(400, 300);
		setTitle("Mouse Line Drawing Example"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		add(new MyPanel());
	}
		
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new DrawRectByClick()).setVisible(true);
	}


}
