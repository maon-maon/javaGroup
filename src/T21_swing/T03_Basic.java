package T21_swing;

import javax.swing.JFrame;

//j붙음 스윙이 됨
@SuppressWarnings("serial")
public class T03_Basic extends JFrame {
	
	public T03_Basic() {
		super("스윙연습1");
//		setBounds(300, 250, 300, 250); // 중앙을 고정했으니 좌표 필요없음
		setSize(300, 250);//위에것 주석하면 사이즈가 사라지니 사이즈 임의로 줘야 함
	
		//3개 명령어가 한 세트로 사용됨
		//프레임을 윈도우 화면 중앙에 띄우기
		setLocationRelativeTo(null);
		
		//화면 크기 고정
		setResizable(false);// 기본값이 true
		
		//윈도우 창 닫기 . 따로 지정하지 않아도 닫힘
		//명령어 기억
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new T03_Basic();
	}
}
