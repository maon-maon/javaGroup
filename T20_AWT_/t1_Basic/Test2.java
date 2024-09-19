package T20_AWT_.t1_Basic;

import java.awt.Frame;// 초창기는 awt가 다 했음
//이 방식 많이 씀!!!
public class Test2 extends Frame{//3. 부모 프레임을 사용함
	
	public Test2() {
//		super("AWT 프레임");//슈퍼부름=프레임부름 //2. 기본생성자의 슈퍼가 부모를 호출
		setTitle("AWT 프레임");
		setSize(300,250);
		
		setVisible(true);//뷰닫기는 콘솔에서 간으함
	}
	
	public static void main(String[] args) {
		//자식이 상속받은 부모 타입으로 자신을 생성해서  사용할 수 일음
		new Test2();//1.자신객체생성
	}
}
