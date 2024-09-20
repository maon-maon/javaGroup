package T20_AWT_.t3_Event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//앱의 특징 : 모든 기능을 다 넣어서 쓰기 때문에 길어짐 ->웹은 MVC방식으로 함

//클릭=이벤트발생 ->리스너 감지->핸들러 처리
@SuppressWarnings("serial")
public class T4_ButtonEvent extends Frame implements ActionListener {
	Button btnPlay, btnst, btnEx,btnMessage;
	Label lblMessage;
	
	//위치조정은 레이아웃 사용해서 = 객체라서
	public T4_ButtonEvent() {
		setTitle("버튼 이벤트 연습");
		setBounds(600, 250, 300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		//레이블
		btnPlay= new Button("Start");
		btnst= new Button("Stop");
		btnEx= new Button("Exit");
		btnMessage= new Button("Message");
		
		add(btnPlay);
		add(btnst);
		add(btnEx);
		add(btnMessage);
		
		lblMessage = new Label("메세지...");
		add(lblMessage);
		
		/*===========================================*/
		
		btnPlay.addActionListener(this);
		btnst.addActionListener(this);
		btnEx.addActionListener(this);
		btnMessage.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T4_ButtonEvent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnText = (Button) e.getSource(); 
		
		if(btnText.getLabel().equals("Start")) {
			System.out.println("시작버튼을 눌렀습니다.");
			lblMessage.setText("Start");
		}
		else if(btnText.getLabel().equals("Stop")) {
			System.out.println("정지버튼을 눌렀습니다.");
			lblMessage.setText("Stop");
		}
		else if(btnText.getLabel().equals("Exit")){
			System.out.println("정지버튼을 눌렀습니다.");
			System.exit(0);
			}
		else if(btnText.getLabel().equals("Message")){
			System.out.println("메세지버튼을 눌렀습니다.");
			lblMessage.setText("message");
		}
	}
}
