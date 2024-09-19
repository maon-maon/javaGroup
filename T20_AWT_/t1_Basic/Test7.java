package T20_AWT_.t1_Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//뷰창 닫기는 임플리먼드 WindowListener: 윈도우창 감지하는 명령어 리스너=감지자

@SuppressWarnings("serial")// 노란색 안내 뜰 때 무시한다는 의미로 넣음=@SuppressWarnings("변수"):매개변수 알아서 들어감
public class Test7 extends Frame implements WindowListener, ActionListener {//다중인터페이스구현
	//임플리먼트->Test3 메소드 생성->오버라이드
	
	public Test7() {
		super("AWT 프레임");
//		setTitle("AWT 프레임");
//		setSize(300,250);
		//좌표주기    좌표      크기
//		setBounds(300, 200, 350, 250); 
		setBounds(300, 100, 350, 250); 
		
		//컨테이너 위에 컴포넌트위에 레이블을 올림
		//컴포넌트= 객체 하나하나의 의미 : 사용하는 모든 컴포넌트는 생성 : 버튼생성
		// 레이블 컴포넌트 : 화면에 출력하는 내용
		Label label =  new Label("레이블 테스트입니다.");//()안에 제목을 넣을 수 있음
		this.add(label);//awt 윈도우에 종속적임 UTf8은 깨짐
		
		//버튼 컴포넌트 //버튼 많이 사용함=따로 예약어가 있음=ActionListener
		Button exitBut = new Button("Exit");
		//this.add(button);
		add(exitBut);
		
		setVisible(true);
		
		addWindowListener(this);
		exitBut.addActionListener(this);//버트의 명령어 리스너 임플걸어서 호출
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
		new Test7();//기본생성	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);//액션 리슨 버튼에 대한
		
	}
}
