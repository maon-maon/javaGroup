package T21_swing;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class T06 extends JFrame {
	JPanel pn1;
	JButton btnExit;
	CheckboxGroup gender;//그룹을 줘야 한 덩어리로 같이 움직임
	Checkbox rdgender1, rdgender2,rdgender3;//여러개 선택시 사용
	
	public T06() {
		setTitle("라디오 버튼 연습");// 둘 중 하나만 선택=라디오버튼
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setLayout(new FlowLayout());
		
		pn1 = new JPanel();
		
		gender = new CheckboxGroup();
		rdgender1 = new Checkbox("남자", gender, true);
		rdgender2 = new Checkbox("여자", gender, false);
		rdgender3 = new Checkbox("미선택", gender, false);
		
		pn1.add(rdgender1);
		pn1.add(rdgender2);
		pn1.add(rdgender3);
		
		add(pn1);
		
		setVisible(true);
		
		//============
		
	}
	
	public static void main(String[] args) {
		new T06();
	}
}
