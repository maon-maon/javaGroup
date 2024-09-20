package T20_AWT_.t3_Event;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T2_KeyboardEvent extends Frame implements WindowListener, KeyListener{

	public T2_KeyboardEvent() {
		setTitle("키보드 이벤트 연습");
		setBounds(300, 250, 300, 300);
		setVisible(true);
		
		
		/*===========================*/
		
		addWindowListener(this);//윈도우를 꺼내는 리스너// 임플리먼트로 라단에 생성했으니 this로 자기자신 호출만 함
		addKeyListener(this);//키를 꺼내는 리스너 
		
		
	}
	
	public static void main(String[] args) {
		new T2_KeyboardEvent();
	}
	
	//키보드 핸들러
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("키보드 입력중...");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키보드 누르느 순간...");
		System.out.println("입력된 키는? "+ e.getKeyChar() + "/" +e.getKeyCode());
	}
	@Override
	public void keyReleased(KeyEvent e){
		System.out.println("키보드 눌렀다 놓는 순간...");
	}

	//윈도우 핸들러
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {System.exit(0);}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e){}
}
