package T13_Anonymous.t01;
//구현객체
public class Car extends Tire {

	@Override
	public void roll() {
		System.out.println("추상 타이어가 굴러갑니다.");
	}

	public void mod1() {
		System.out.println("Car(자식객체)클래스의 mod1메소드입니다.");
	} 
	
	//추상클래스를 구현한 익명클래스
	//roll의 익명객체 
	//1. 중첩의 인스턴스멤버클래스
	Tire tire1 = new Tire() {//객체변수지만 필드로 봄
		@Override
		public void roll() {
			System.out.println("익명객체에서 타이어가 굴러갑니다.");
		}
	};
	
	public void mod2() {//mod2찍으면 롤 두개가 실행됨
		tire1.roll();
		tire1.roll2();
	}
	
	//메소드 안에서 익명클래스 사용
	public void mod3() {//2.중첨의 로컬클래스
		Tire tire2 = new Tire() {
			@Override
			public void roll() {
				System.out.println("메소드mod3 안의 익명클래스 안의 roll()메소드");
			}
		};
		tire2.roll();
		tire2.roll2(); 
	}
	
}
