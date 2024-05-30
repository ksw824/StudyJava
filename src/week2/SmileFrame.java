//Week2 예제 
package week2;

import java.awt.Graphics;

import javax.swing.JFrame;

public class SmileFrame extends JFrame {
	public void paint(Graphics g) {
		g.drawOval(130, 100, 150, 150);
		g.fillOval(173, 120, 10, 30);
		g.fillOval(228, 120, 10, 30);
		g.drawArc(155, 130, 100, 100, 200, 140);
	}
}
