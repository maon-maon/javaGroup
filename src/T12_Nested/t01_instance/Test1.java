package T12_Nested.t01_instance;

//중첩클래스: 인스턴스 멤버 클래스
public class Test1 {
	int su=100;//전역변수는 동일변수명 사용해도 오류 안남
	public Test1() {
		System.out.println("Test1클래스입니다.");
	}
	
	public void modTest1() {
		int su = 150;//지역변수는 동일 메소드내에서 영향을 줌
		if(su <0) {
//			int su = 200;
			System.out.println("su : "+su);
		}
		System.out.println("Test1클래스의 modTest1메소드입니다.");
	}
	
	//멤버클래스 생성
	public class Aa{
//		int su = 200;//(o) //중첨된 클래스의 전역필드가 됨
		int suA = 200;//필드
		
		public Aa() {
			System.out.println("Test1클래스 안의 중첩클래스 Aa의 기본생성자입니다.");
		}
		
		public void modTest1A() {
			System.out.println("Test1클래스 안의 중첩클래스의 modTest1A()메소드자입니다.");
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
