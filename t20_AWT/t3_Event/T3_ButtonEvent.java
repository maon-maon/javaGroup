package t20_AWT.t3_Event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//앱의 특징 : 모든 기능을 다 넣어서 쓰기 때문에 길어짐 ->웹은 MVC방식으로 함

//클릭=이벤트발생 ->리스너 감지->핸들러 처리
@SuppressWarnings("serial")
public class T3_ButtonEvent extends Frame implements ActionListener {
	Button btnPlay, btnst, btnEx;
	
	public T3_ButtonEvent() {
		setTitle("버튼 이벤트 연습");
		setBounds(300, 250, 300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		//레이블
		btnPlay= new Button("Start");
		btnst= new Button("Stop");
		btnEx= new Button("Exit");
		
		add(btnPlay);
		add(btnst);
		add(btnEx);
		
		/*===========================================*/
		
		btnPlay.addActionListener(this);
		btnst.addActionListener(this);
		btnEx.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T3_ButtonEvent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnText = (Button) e.getSource(); 
		
		if(btnText.getLabel().equals("Start")) System.out.println("시작버튼을 눌렀습니다.");
		else if(btnText.getLabel().equals("Stop")) System.out.println("정지버튼을 눌렀습니다.");
		else{
			System.out.println("정지버튼을 눌렀습니다.");
			System.exit(0);
			}
	}
}
