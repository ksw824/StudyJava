package midterm_Practice;

import java.awt.Font;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EX01 extends JFrame{
	   private int size;
	   public EX01(int size) {
	      this.size = size;
	      setSize(600, 600);
	      setTitle("문제 5번");
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      JLabel JP = new JLabel();
	      
	   
	   }
	   public void paint (Graphics g) {
		  System.out.println("paint");
	      g.setFont(new Font("Serif", Font.BOLD, 30));
	      g.drawString("폰트 크기="+this.size, 200, 100);
	   }
	   public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      System.out.println("폰트 크기를 입력하시오 :");
	      int size = input.nextInt();
	      new EX01(size);
	//      new EX01(size).setVisible(true);

	   }

	}