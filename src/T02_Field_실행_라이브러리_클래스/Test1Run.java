package T02_Field_실행_라이브러리_클래스;
//실행 라이브러리에 main이 있어야 함
public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("t1.su1 :"+t1.su1);
		System.out.println("t1.su2 :"+t1.su2);
		System.out.println();
		
		System.out.println("t1.d1 :"+t1.d1);
		System.out.println("t2.d2 :"+t1.d2);
		System.out.println();
		
		System.out.println("t1.l1 :"+t1.l1);
		System.out.println("t1.l2 :"+t1.l2);
		System.out.println();
		System.out.println("=============================");
		
		Test1 t2 = new Test1();//t2라는 이름에 Test1_클래스_생성비교 클래스를 새로 하나 만들어라
		System.out.println("t2.su1 :"+t2.su1);
		System.out.println("t2.su1 :"+t2.su2);
		t2.su1 =500;//su1에 값을 500넣음
		System.out.println("t2.su1 :"+t2.su1);
		t2.su1 += t1.su2;//su1에 su2를 누적해라
		System.out.println("t2.su1 :"+t2.su1);
		System.out.println();
		
		System.out.println("t1.su1 :"+t1.su1);
		System.out.println("t1.su2 :"+t1.su2);
		
	}
}
