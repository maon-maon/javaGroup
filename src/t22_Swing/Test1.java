package t22_Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Test1 extends JFrame {

	private JPanel contentPane;

	public Test1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 900, 520);
		setSize(800,600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 282);
		contentPane.add(pn1);
		pn1.setLayout(null);
		
		JButton btnstart = new JButton("시작");
		btnstart.setFont(new Font("굴림", Font.PLAIN, 18));
		btnstart.setBounds(83, 51, 150, 50);
		pn1.add(btnstart);
		
		JButton btnstop = new JButton("정지");
		btnstop.setFont(new Font("굴림", Font.PLAIN, 18));
		btnstop.setBounds(316, 51, 150, 50);
		pn1.add(btnstop);
		
		JButton btnexit = new JButton("종료");
		btnexit.setFont(new Font("굴림", Font.PLAIN, 18));
		btnexit.setBounds(549, 51, 150, 50);
		pn1.add(btnexit);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 280, 784, 281);
		contentPane.add(pn2);
		pn2.setLayout(null);
		
		JLabel lblmessage = new JLabel("New label");
		lblmessage.setIcon(new ImageIcon("D:\\javaGroup\\java\\works2\\windowBuilder\\images\\img50.jpg"));
		lblmessage.setBounds(122, 62, 530, 141);
		pn2.add(lblmessage);
	}

	public static void main(String[] args) {
		new Test1();
	}
}
