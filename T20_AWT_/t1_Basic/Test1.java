package T20_AWT_.t1_Basic;

//잘 안씀
//다시 공부해야 함
//강의 늦음
import java.awt.Frame;

// Container처리(Frame)
public class Test1 {
	public static void main(String[] args) {
		Frame frame = new Frame(); // 프레임을 임포트 거는 문장 객체 생성해서 사용함
		
		frame.setTitle("AWT 프레임"); // 보여주는 창의 이름
		frame.setSize(300,250);	// 프레임의 크기(폭, 높이) - 픽셀단위
		
		frame.setVisible(true); //보여주는 창
	}
}
