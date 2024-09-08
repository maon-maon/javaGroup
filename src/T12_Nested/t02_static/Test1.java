package T12_Nested.t02_static;

//중첩클래스: 정적 멤버 클래스
public class Test1 {
	int su=300;
	
	public Test1() {
		System.out.println("Test1클래스입니다.");
	}
	
	public void modTest1() {
		System.out.println("Test1클래스의 modTest1메소드입니다.");
	}
	
	//중첨클래스 인스턴스 멤버 클래스=정적 멤버클래스
	public static class Aa{//스테이틱은 생성아니라 클래스 ㅣ이름으로 접근
		int suA = 400;//일반필드
		static int suB=450;//정적필드
		
		public Aa() {
			System.out.println("Test1클래스 안의 중첩클래스 Aa의 기본생성자입니다.");
		}
		
		public void modTest1A() {
			System.out.println("Test1클래스 안의 중첩클래스의 modTest1A()메소드입니다.");
		}
		
		public static void modTest1B() {//정적메소드
			System.out.println("Test1클래스 안의 중첩클래스의 modTest1B()메소드입니다.");
		}
	}
	
	public class Bb{
		
	}
}

class Aa{
	public Aa() {
		System.out.println("바깥 Aa클래스입니다.");
	}
}
