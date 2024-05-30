//Week4 예제 #미완성 
package week4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class SpiralCurve extends JFrame{
	private static final int XINIT = 250;
	private static final int YINIT = 250;
	private static final int K = 4;
	private static final int NUMOFPOINTS = 500;
	private static final double DELTA = 0.1;
	
	
	public SpiralCurve() {
		setSize(500,500);
		setTitle("Spiral Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		int xOld = XINIT, yOld = YINIT, xNew, yNew;
		double t = 0.0;
		for(int i = 0; i< NUMOFPOINTS ;i++) {
			xNew = (int)(XINIT + K*t*Math.cos(t));
			yNew = (int)(YINIT + K*t*Math.sin(t));
			g.drawLine(xOld, yOld, xNew, yNew);
			xOld = xNew;
			yOld = yNew;
			t += DELTA;
		}
	}
}
