package T21_swing;

import javax.swing.JFrame;

//j붙음 스윙이 됨
public class T02_Basic extends JFrame {
	
	public T02_Basic() {
		super("스윙연습1");
		setBounds(300, 250, 300, 250);
	
		setVisible(true);
		
		//윈도우 창 닫기 . 따로 지정하지 않아도 닫힘
		//명령어 기억
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new T02_Basic();
	}
}
