package T20_AWT_.t2_Layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T3_borderLayout extends Frame {
	Button btn1,btn2,btn3,btn4,btn5; //컴퍼넌트는 전부 필드로 뺌. 코드 길어짐 방지
	
	public T3_borderLayout() {
		/*===========UI(화면설계)================*/
		setTitle("BorderLayout 연습");
		setBounds(300, 200, 300, 300);
		setLayout(new BorderLayout());//동서남북중앙의 순서로 배치됨
		
		btn1 = new Button("동쪽");
		btn2 = new Button("서쪽");
		btn3 = new Button("남쪽");
		btn4 = new Button("북쪽");
		btn5 = new Button("중앙(창닫기)");
		
		add(btn1, BorderLayout.EAST);//열거형상수=클래스이름으로 부름(static은 생성하지 않음)
		add(btn2, BorderLayout.WEST);
		add(btn3, BorderLayout.SOUTH);
//		add(btn4, BorderLayout.NORTH);
//		add(btn5, BorderLayout.CENTER);
		add(btn4, "North"); //상수 문자열 취급으로 첫글자만 대문자로 써도 됨
		add(btn5, "Center");
		
		
		setVisible(true);
		
		/*============코드(메소드처리)===============*/
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new T3_borderLayout();
	}
}
