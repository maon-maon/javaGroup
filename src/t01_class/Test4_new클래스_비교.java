package t01_class;

public class Test4_new클래스_비교 {
	public static void main(String[] args) {
		Test1_클래스_생성비교 t11 = new Test1_클래스_생성비교();
		Test1_클래스_생성비교 t12 = new Test1_클래스_생성비교();
		
		if(t11==t12) {
			System.out.println("1.t11객체와 t12객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("1.t11객체와 t12객체는 서로 다른 객체입니다.");
		}
		
		Test1_클래스_생성비교 t13;//타입의 변수만 생성
		t13 = t11;
		if(t11==t13) {//얕은복사
			System.out.println("2.t11객체와 t13객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("2.t11객체와 t13객체는 서로 다른 객체입니다.");
		}
		if(t12==t13) {//깊은복사
			System.out.println("3.t12객체와 t13객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("3.t12객체와 t13객체는 서로 다른 객체입니다.");
		}
		
//		Test1_클래스_생성비교 t14="mbc";//Test1의 타입이 없어서 문자열 불가능
		Test1_클래스_생성비교 t14=null;//null을 주면 사용할 수 있음
		if(t13==t14) {//얕은복사
			System.out.println("4.t13객체와 t14객체는 서로 같은 객체입니다.");
		}
		else {
			System.out.println("4.t13객체와 t14객체는 서로 다른 객체입니다.");
		}
		
		if(t14==null) {//t14에 넣은 널과비교 null을 비교함 
			System.out.println("5.t14객체 초기값은 null입니다.");
		}
		else {
			System.out.println("5.t14객체 초기값은 null 아닙니다.");
		}
		
		/*
		if(t14.equals("null")) {//문자열과 비교 불가능 "null"은 문자열임 비교 안 됨
		if(t14.equals(null)) {//null이라는 예약어라 사용 못함 오류 발생 컴파일에러x실행에러o
			System.out.println("t14객체 초기값은 null입니다.");
		}
		else {
			System.out.println("t14객체 초기값은 null 아닙니다.");
		}
		*/
	}
}
