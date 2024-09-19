package T21_swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//j붙음 스윙이 됨. 윈도우에 독립적임=JVM이 UTF-8로 해석해서 한글 안 꺠짐
public class T04_Button extends JFrame {
	JButton btnExit;
	
	public T04_Button() {
		super("버튼연습");
		setSize(300, 300);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		btnExit = new JButton("종료");
		add(btnExit);
		
		setVisible(true);
		
		//==================
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T04_Button();
	}
}
