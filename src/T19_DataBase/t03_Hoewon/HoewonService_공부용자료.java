package T19_DataBase.t03_Hoewon;

import java.util.Scanner;

public class HoewonService_공부용자료 {
	Scanner sc = new Scanner(System.in);
	//실제 일을 하는 메소드의 집합체
	//실행하는 메뉴의 처리를 도와줌
	//비지니스로직
	public void setInput(HoewonDAO dao) {
		//데이터베이스DAO를 사용
		//DB에 저장할 정보를 담아주는 역할 = 입력
		String name, gender, joinday, address;
		int age;
		//데이터 입력받음
		System.out.println("==>회원정보 등록");//2. 정보 받을 변수 입력창
		System.out.print("성명 : "); name = sc.next();
		System.out.print("나이 : "); age = sc.nextInt();
		System.out.print("성별 : "); gender = sc.next();
		System.out.print("가입일 : "); joinday = sc.next();
		System.out.print("주소 : "); address = sc.next();
		
		//데이버베이스 객체 생성 1.
//		HoewonDAO dao = new HoewonDAO();//1.0이걸 호출 //3.0이걸 사용 안 함(로그 계속 찍히는 문제점 개선)
		HoewonVO vo = new HoewonVO();// 이걸 사용함1.2
		
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJoinday(joinday);
		vo.setAddress(address);
		
//		dao.setInput(name, age, gender, joinday, address);//이렇게 안 하려고 VO객체 사용1.1
//		dao.setInput(vo);//1.3 //넘어온값은 정수로 옴
		int res =dao.setInput(vo);//1.3 //넘어온값은 정수로 옴
		
		//저장이되면 1, 안되면 0
		if(res !=0) System.out.println("회원 등록 완료 ");
		else System.out.println("회원등록실패");
		
//		dao.connClose();//사용한 DB를 닫아줘야 함 //3.1이거 닫음 (로그찍힘=열고닫음 또열고닫음 반복)
	}
}
