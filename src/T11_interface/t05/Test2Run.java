package T11_interface.t05;
//익명클래스인 구현클래스
public class Test2Run {
	public static void main(String[] args) {
//		new Test2();//인터페이스를 생성 못함 다른 방법 사용.
		
		//익명객체1
		Test2 t22 = new Test2() {//인터페이스에서 선언한 추상메소드 abc를 여기서 오버라이드해서 만들어서 사용함
			int atom=20;
			
			public void abc() {//구현클래스를 안에 만들어서 사용클래스 이름이 없승=익명클래스 // 파일명이 안 생기기 떄문에 익명
				int temp=atom;
				System.out.println("Test2Run클래스의 t22익명객체안의 abc()메소드입니다.");
				System.out.println("AA ="+AA+ ", atom =" +atom+", temp = "+temp);
			}
		};
		
		//익명객체2 :구현객체2번
		Test2 t23 = new Test2() {//인터페이스의 실행블럭{}을 만듦
			int atom=40;
			
			public void abc() {//선언을 바꾸면 안 됨
				int temp=atom;
				System.out.println("Test2Run클래스의 t23익명객체안의 abc()메소드입니다.");
				System.out.println("AA ="+AA+ ", atom =" +atom+", temp = "+temp);
			}
		};
		
		//익명객체안의 메소드 접근(호출)하기
		//인터페이스 변수로 익명객체안의 필드와 일반변수는 접근 불가이다.
		//t22.atom은 호출불가 //필드int는 호출 불가능
		t22.abc();//메소드는 호출가능
		System.out.println();
		t23.abc();
		System.out.println();
		
		if(t22==t23) System.out.println("같은 객체를 가리킵니다.");
		else System.out.println("다른 객체를 가리킵니다.");
		
	}
}
