package week5;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BlueBoxFrame extends JFrame{
	private int width;
	private int height;
	public BlueBoxFrame(int width, int height) {
		this.width = width;
		this.height = height;
		setSize(width+100,height +100);
		setTitle("직사각형 그리기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);		
	}
	
	
	
	public void paint(Graphics g) {
		Font font = new Font("Serif", Font.BOLD, 30);
		g.setColor(Color.BLUE);
		g.fillRect(50, 50, this.width, this.height);
		g.setColor(Color.BLACK);
		g.setFont(font);
		g.drawString(this.width + "x" + this.height, 50, 100);

	}
}
