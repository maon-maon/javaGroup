package T11_interface.t05;
//일반적인 방식 //한 페이지에 4개 클래스 생성 됨
interface Aa{//인터페이스추상클래스
	int AA=10;
	void abc();
}

//다중클래스 구현
class Bb implements Aa{//구현클래스
	@Override
	public void abc() {
		System.out.println("Bb클래스의 abc()메소드입니다.");
	}
}
	
class Cc implements Aa{//클래스
	@Override
	public void abc() {
		System.out.println("Cc클래스의 abc()메소드입니다.");
	}
}


public class Test1Run {//실행클래스
	public static void main(String[] args) {
//		Bb b1 = new Bb();
//		Bb b2 = new Bb();
//		Cc c1 = new Cc();
//		Cc c2 = new Cc();
		Aa b1 = new Bb();
		Aa b2 = new Bb();
		Aa c1 = new Cc();
		Aa c2 = new Cc();
		
		b1.abc();
		b2.abc();
		c1.abc();
		c2.abc();
	}
}
