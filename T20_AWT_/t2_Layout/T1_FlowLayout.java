package T20_AWT_.t2_Layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T1_FlowLayout extends Frame{
	//생성자를 통해서 UI설계처리한다.
	public T1_FlowLayout() {
		super("FlowLayout 연습");
		
		setBounds(300, 250, 300, 300); //프레임을 플로어로 바꿔야람
		setLayout(new FlowLayout());
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		Button btn6 = new Button("버튼6");
		
		add(btn1);//내꺼는 this 생략 가능
		add(btn2);//1번 버튼 위에 2번이 생겨버림 > 레이아웃 조절이 필요-> UI 구조 필요함
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new T1_FlowLayout();
	}
}
