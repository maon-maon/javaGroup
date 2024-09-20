package T21_swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class T05_BorderLayout extends JFrame {
	JPanel pn1, pn11, pn12, pn13;
	JButton btn1,btn2,btn3,btn4,btn5;
	
	public T05_BorderLayout() {
		setTitle("보더 레이아웃");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setLayout(new BorderLayout());
		
		pn1 = new JPanel();
		pn1.setLayout(new GridLayout(3,1));
		
		
		btn1 = new JButton("동쪽");
		btn2 = new JButton("서쪽");
		btn3 = new JButton("남쪽");
		btn4 = new JButton("북쪽");
		btn5 = new JButton("중앙");
		
		add(btn1, BorderLayout.EAST);
		add(btn2, BorderLayout.WEST);
		add(btn3, BorderLayout.SOUTH);
		add(btn4, BorderLayout.NORTH);
		add(pn1, BorderLayout.CENTER);//패널을 생성했으니 올리는것도 패널임
		
		
		//버튼 중앙에 배치
		pn11 = new JPanel();
		pn12 = new JPanel();
		pn13 = new JPanel();
		
		pn1.add(pn11);
		
		pn12.add(btn5);
		pn1.add(pn12);
		
		pn1.add(pn13);
		
		setVisible(true);
		
		//============
		
	}
	
	public static void main(String[] args) {
		new T05_BorderLayout();
	}
}
