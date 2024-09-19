package T20_AWT_.t1_Basic;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//뷰창 닫기는 임플리먼드 WindowListener: 윈도우창 감지하는 명령어 리스너=감지자
public class Test4 extends Frame implements WindowListener {//상속 무조건 임플 추가
	//임플리먼트->Test3 메소드 생성->오버라이드
	
	public Test4() {
		super("AWT 프레임");
//		setTitle("AWT 프레임");
//		setSize(300,250);
		//좌표주기    좌표      크기
		setBounds(300, 200, 350, 250); 
		
		setVisible(true);
		
		addWindowListener(this);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override //닫는동작
	public void windowClosing(WindowEvent e) {
		System.exit(0);//시스템 종료 명령어. 시스템에 있는 탈출 명령어 사용
	}

	@Override//닫은 것
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	
	
public static void main(String[] args) {
	new Test4();//기본생성	
	
	
	}
}
