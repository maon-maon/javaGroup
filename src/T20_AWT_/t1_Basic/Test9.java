package T20_AWT_.t1_Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//뷰창 닫기는 임플리먼드 WindowListener: 윈도우창 감지하는 명령어 리스너=감지자

@SuppressWarnings("serial")
public class Test9 extends Frame {
	//임플리먼트->Test3 메소드 생성->오버라이드
	
	public Test9() {
		super("AWT 프레임");
//		setTitle("AWT 프레임");
//		setSize(300,250);
		setBounds(300, 200, 350, 250); 
		
		// 레이블 컴포넌트 : 화면에 출력하는 내용
		Label label =  new Label("레이블 테스트입니다.");//()안에 제목을 넣을 수 있음
		this.add(label);//awt 윈도우에 종속적임 UTf-8은 깨짐
		
		//버튼 컴포넌트 //버튼 많이 사용함=따로 예약어가 있음=ActionListener
		Button exitBut = new Button("Exit");
		//this.add(button);
		add(exitBut);
		
		exitBut.addActionListener(new ActionListener() {//임플리먼트x ->익명이너클래스로 사용
			//버튼을 울렀을 떄 작동
			@Override//추상메소드 1개 생성 = 아답터가 없음
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//어댑터 사용시 익명추상메소드명이  안 나옴 : 내용을 모르면 오히려 어울 수 았움
		//어댑터 사용시 필요한 메소드만 선택해서 쓸 수 있음. 간략해서 좋음
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		});

		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test9();//기본생성	
	}

}
