package T11_interface.t01;

public class TestRun2 {
	public static void main(String[] args) {
		Test1 seoul = new Seoul();//부모객체로 타입변환, 우두머리로 객체 통합가능
		seoul.date();
		seoul.date2();
		System.out.println();
		
		Test1.date3();
		System.out.println();
		
		Test1 busan= new Busan();
		busan.date();
		busan.date1(500);
		busan.date1(5000000);
		busan.date1(-500);
		System.out.println("===============");
		
		Test1[] test1 = {new Seoul(),new Busan()};
		for(int i=0; i<test1.length;i++) {
			test1[i].date();
			test1[i].date1(600);
			test1[i].date1(6000000);
			test1[i].date1(-600);
			test1[i].date2();
//			test1[i].date3();//스테이틱이라 고정되서 사용 불가
		}
	}
}
