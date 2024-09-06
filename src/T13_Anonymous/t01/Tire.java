package T13_Anonymous.t01;

public abstract class Tire {
	public abstract void roll(); //추상메소드 public abstract생략불가
	
	public void roll2() {//일반메소드
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}
