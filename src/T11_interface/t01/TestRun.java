package T11_interface.t01;

public class TestRun {
	public static void main(String[] args) {
//	new Test1();//클래스 생성 불가능
		
		Seoul seoul = new Seoul();//구현객체 생성해서 사용함
		seoul.date();
		seoul.date1(0);//생성한 변수명으로 호출
		System.out.println();
		
		Test1.date3();//인터페이스는 클래스명을 씀
		System.out.println();
		
		Busan busan= new Busan();
		busan.date();
		busan.date1(500);
		busan.date1(5000000);
		busan.date1(-500);
		System.out.println();
	}
}
