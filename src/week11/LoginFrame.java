//package week11;
//
//import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ButtonGroup;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JRadioButton;
//import javax.swing.JTextField;
//
//public class LoginFrame extends JFrame{
//	private JButton buttonGo;
//	private JRadioButton[] major;
//	private JTextField name;
//	//private JCheckBox storeId;
//	
//	public LoginFrame() {
//		setTitle("전공 선택");
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
//		
//		JPanel panel = new JPanel();
//		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
//		LoginListener listener = new LoginListener();
//		JLabel label1 = new JLabel("이름과 전공을 선택하시오",JLabel.CENTER);
//		label1.setFont(new Font("Serif", Font.BOLD,26));
//		label1.setForeground(Color.blue);
//		JLabel label2 = new JLabel("이름", JLabel.CENTER);
//		name = new JTextField(10);
//		ButtonGroup group = new ButtonGroup();
//		JLabel label3 = new JLabel("전공: ");
//		major = new JRadioButton[5];
//		major[0] = new JRadioButton("소프트웨어");
//		major[1] = new JRadioButton("가상현실");	
//		group.add(major[0]);
//		group.add(major[1]);
//		buttonGo = new JButton("Go");
//		add(label1);
//		add(label2);
//		add(name);
//		add(label3);
//		add(major[0]);
//		add(major[1]);
//		pack();
//	}
//	public class LoginListener implements ActionListener {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			if(e.getSource()==buttonGo) {
//				String myName = name.getText();
//				String myMajor = major[]
//			}
//		}
//		
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//
//		}
//
//
//	}
//
//	
//
//}
