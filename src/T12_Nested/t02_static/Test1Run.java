package T12_Nested.t02_static;

public class Test1Run {
	public static void main(String[] args) {
		 Test1 t1 = new Test1();
		 System.out.println("Test1클리스의 su필드"+t1.su);
		 t1.modTest1();
		 System.out.println();
		 
		 //외부클래스.클래스명 변수 = 뉴 외부클래스.클래스명(); 이런식으로 접근해서 생성 후 사용
		 Test1.Aa t1a= new Test1.Aa();//스테이틱은 Aa클래스를 생성해서 사용 
		 System.out.println("중첩클래스안의 suA필드 :"+t1a.suA);
		 t1a.modTest1A();
		 System.out.println();
		 
		 //스테이틱은 메소드열역에 만들어지고 클래스 변수명으로 접근한다
		 //클래스 이름.으로 접근 외부클래스이름.클래스이름
//		 System.out.println("중첩클래스안의 suA필드 :"+t1a.suB);//바람직하지 못한 접근 생성한걸로 접근하면 안 좋음
		 System.out.println("중첩클래스안의 suA필드 :"+Test1.Aa.suB);
		 //외부 클래스Test1의 내부클래스Aa의 안에있는 필드suB의 값을 호출함
		 Test1.Aa.modTest1B();
		 //외부 클래스Test1의 내부클래스Aa의 안에있는 메소드modTest1B를 호출
		 
		 //sttic 사용시 쿠조건 클래스이름으로 접근해야함
	}
}
