package t22_Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class Test2 extends JFrame {
	JPanel pn1,pn2, pn3;
	JButton btn1,btn2,btn3,btn4,btn5,btn6;
	JLabel lblcnt1,lblcnt2,lblcnt3,lblcnt4;
	
	
	public Test2() {
		setTitle("연습");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		pn1 = new JPanel();
		pn1.setBounds(0, 0, 784, 83);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblTitle = new JLabel("이미지 연습창");
		lblTitle.setFont(new Font("굴림", Font.PLAIN, 16));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(192, 10, 374, 73);
		pn1.add(lblTitle);
		
		JButton btnExit = new JButton("종료");
		btnExit.setBounds(590, 10, 156, 63);
		pn1.add(btnExit);
		
		JButton btnRandom = new JButton("랜덤보기");
		btnRandom.setBounds(24, 10, 156, 63);
		pn1.add(btnRandom);
		
		pn2 = new JPanel();
		pn2.setBounds(0, 83, 784, 389);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setIcon(new ImageIcon(Test2.class.getResource("/t22_Swing/images/img11.jpg")));
		lbl1.setBounds(0, 0, 196, 389);
		pn2.add(lbl1);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setIcon(new ImageIcon(Test2.class.getResource("/t22_Swing/images/img12.jpg")));
		lbl2.setBounds(196, 0, 196, 389);
		pn2.add(lbl2);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setIcon(new ImageIcon("D:\\javaGroup\\java\\works2\\windowBuilder\\images\\img13.png"));
		lbl3.setBounds(392, 0, 196, 389);
		pn2.add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setIcon(new ImageIcon("D:\\javaGroup\\java\\works2\\windowBuilder\\images\\img14.jpg"));
		lbl4.setBounds(588, 0, 196, 389);
		pn2.add(lbl4);
		
		pn3 = new JPanel();
		pn3.setBounds(0, 472, 784, 89);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		 btn1 = new JButton("그림1");
		btn1.setBounds(32, 10, 119, 63);
		pn3.add(btn1);
		
		 btn2 = new JButton("그림2");
		btn2.setBounds(183, 10, 112, 63);
		pn3.add(btn2);
		
		 btn3 = new JButton("그림3");
		btn3.setBounds(327, 10, 119, 63);
		pn3.add(btn3);
		
		 btn4 = new JButton("그림4");
		btn4.setBounds(478, 10, 119, 63);
		pn3.add(btn4);
		
		 btn5 = new JButton("모두보기");
		btn5.setBounds(629, 10, 119, 63);
		pn3.add(btn5);
		
		setVisible(true);
		
		//=========================================//
		
		//종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//1번 그림보기
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(true);
				lbl2.setVisible(false);
				lbl3.setVisible(false);
				lbl4.setVisible(false);
			}
		});
		
		//2번 그림보기
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(false);
				lbl2.setVisible(true);
				lbl3.setVisible(false);
				lbl4.setVisible(false);
			}
		});
		
		//3번 그림보기
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(false);
				lbl2.setVisible(false);
				lbl3.setVisible(true);
				lbl4.setVisible(false);
			}
		});
		
		//4번 그림보기
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(false);
				lbl2.setVisible(false);
				lbl3.setVisible(false);
				lbl4.setVisible(true);
			}
		});
		
		//모든 그림보기
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(true);
				lbl2.setVisible(true);
				lbl3.setVisible(true);
				lbl4.setVisible(true);
			}
		});
	}
	
	public static void main(String[] args) {
		new Test2();
	}
}
