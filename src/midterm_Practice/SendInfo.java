package midterm_Practice;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SendInfo extends JFrame{
    public SendInfo() {
        setSize(450,150);
        setTitle("Yes/No Button Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        cPane.setBackground(Color.green);
        JButton btn1 = new JButton("Yes");
        btn1.setSize(getPreferredSize());
        JButton btn2 = new JButton("No");
        cPane.add(btn2);
        
        cPane.add(btn1);
    }
    
    // paint 메소드를 재정의하여 배경색을 그림
    public void paint(Graphics g) {
        // 배경색 그리기
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 450,150);
        
        // 텍스트 그리기
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.BOLD, 50));
        g.drawString("정보를 보내시겠습니까?", 30,80);
    }
    
    public static void main(String[] args) {
        new SendInfo().setVisible(true);
    }
}
