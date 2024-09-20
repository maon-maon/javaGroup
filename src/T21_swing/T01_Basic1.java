package T21_swing;

import javax.swing.JFrame;

//j붙음 스윙이 됨
public class T01_Basic1 extends JFrame {
	
	public T01_Basic1() {
		super("스윙연습1");
		setBounds(300, 250, 300, 250);
	
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new T01_Basic1();
	}
}
