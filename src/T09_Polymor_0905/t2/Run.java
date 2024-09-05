package T09_Polymor_0905.t2;

//instanceof : 과거에 부모객체로 타입변환이 되었었는지를 알아보는 연산자(true/false)
public class Run {
	public static void main(String[] args) {
		Aa aa= new Bb();
		
//		Bb bb = (Bb)aa;//(O)
		
//		Cc cc = (Cc)aa;//(X)//컴파일오류x 실행오류
		
	// Down Casting을 하기위해서는 반드시 Up Casting가 선행되어 있어야 한다.
		if(aa instanceof Bb) {
			Bb bb = (Bb)aa;
			System.out.println("1.Down 캐스팅 성공");
		}
		else {
			System.out.println("1.Down 캐스팅 실패");
		}
		System.out.println();
		
		if(aa instanceof Cc) {
			Cc cc = (Cc)aa;
			System.out.println("2.Down 캐스팅 성공");
		}
		else {
			System.out.println("2.Down 캐스팅 실패");
		}
	}
}
