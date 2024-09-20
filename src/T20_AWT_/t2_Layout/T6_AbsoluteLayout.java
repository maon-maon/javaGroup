package T20_AWT_.t2_Layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//절대 지정 레이아웃 
@SuppressWarnings("serial")
public class T6_AbsoluteLayout extends Frame {//위치지정 레이아웃
	Button btn1, btn2, btn3, btn4, btn5, btnExit;
	Label lbl1,lbl2,lbl3,lbl4,lbl5,lblExit;
	
	public T6_AbsoluteLayout() {
		setTitle("사용자지정 레이아웃");
		setBounds(100, 200, 350, 400);
		setLayout(null);//레이아웃을 아무것도 안 줌 사용자가 지정해야함
		
		/*모든게 다 객체라서 생성해야 함*/
		//버튼
		btn1 = new Button("첫번째");
		btn2 = new Button("두번째");
		btn3 = new Button("세번째");
		btn4 = new Button("네번째");
		btn5 = new Button("다번째");
		btnExit = new Button("종 료");
		//위치
		
		int btnx =150, btny =100; //변수를 주면 일괄처리 가능
		
		btn1.setBounds(btnx, btny, 150, 30);
		btn2.setBounds(btnx, btny+40, 150, 30);
		btn3.setBounds(btnx, btny+80, 150, 30);
		btn4.setBounds(btnx, btny+120, 150, 30);
		btn5.setBounds(btnx, btny+160, 150, 30);
		btnExit.setBounds(btnx, btny+200, 150, 30);
		//실행호출
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btnExit);
		
		//버튼 앞에 라벨 붙이기
		lbl1 = new Label("하나");
		lbl2 = new Label("두울");
		lbl3 = new Label("세엣");
		lbl4 = new Label("네엣");
		lbl5 = new Label("다섯");
		lblExit = new Label("종료");
		
		lbl1.setBounds(50, 100, 100, 30);
		lbl2.setBounds(50, 140, 100, 30);
		lbl3.setBounds(50, 180, 100, 30);
		lbl4.setBounds(50, 220, 100, 30);
		lbl5.setBounds(50, 260, 100, 30);
		lblExit.setBounds(50, 300, 100, 30);
		
		add(lbl1);
		add(lbl2);
		add(lbl3);
		add(lbl4);
		add(lbl5);
		add(lblExit);
		
		setVisible(true);
		
		/*--------------------------*/
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T6_AbsoluteLayout();
	}
}
