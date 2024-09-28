package T19_DataBase.t03_Hoewon;

import java.util.ArrayList;
import java.util.Scanner;

public class HoewonService {
	Scanner sc = new Scanner(System.in);
	HoewonVO vo = null;
	
	//실제 일을 하는 메소드의 집합체
	
	//실행하는 메뉴의 처리를 도와줌
	//비지니스로직
//1.회원 정보 등록	
	public void setInput(HoewonDAO dao) {
		//데이터베이스DAO를 사용
		//DB에 저장할 정보를 담아주는 역할 = 입력
		String name, gender, joinday, address;
		int age;
		//데이터 입력받음
		System.out.println("==> 회원정보 등록");//2. 정보 받을 변수 입력창
		while (true) {
			System.out.print("성명 : "); name = sc.next();
			//동명이인 조회
			vo =  dao.getSearch(name);
			if (vo.getName() ==null) break;
			else	System.out.println("같은 이름이 존재합니다. 다른 이름으로 등록하세요. ");			
		}
		
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
	
	//2.전체 검색하여 결과를 출력
	public void getListt(HoewonDAO dao) {//dao에서 자료 받아서 출력하면 끝//DB꺼내기- VO담기 -Vos에 모으기=어레이리스트로 모으기(한줄=제너릭)
		ArrayList<HoewonVO> vos = dao.getList(); //vos의 타입이 ArrayList<HoewonVO>
		vo = new HoewonVO();
		//		System.out.println("vos : "+vos);
		System.out.println("===========================================================");
		System.out.println("번호\t성명\t나이\t성별\t 가입일\t\t주소");
		System.out.println("===========================================================");
		for(int i=0; i<vos.size(); i++) {
			vo = vos.get(i); //vo의 주소를 줌=얕은복사
			System.out.print(vo.getIdx()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAge()+"\t");
			System.out.print(vo.getGender()+"\t");
			System.out.print(vo.getJoinday().substring(0,10)+"\t");//dateTime에서 날짜만 잘라냄
			System.out.print(vo.getAddress()+"\n");
		}
		System.out.println("===========================================================");
		System.out.println("\t\t총 : "+vos.size()+ " 건");
		System.out.println("===========================================================");
	}
	
	//3.개별검색()하여 결과를 출력
	public int getSearch(HoewonDAO dao, String name) {
		HoewonVO	vo = dao.getSearch(name);//dao에서 이름으로 검색
		
			if(vo.getName() != null) {
				System.out.println("===========================================================");
				System.out.println("번호\t성명\t나이\t성별\t 가입일\t\t주소");
				System.out.println("===========================================================");
				System.out.print(vo.getIdx()+"\t");
				System.out.print(vo.getName()+"\t");
				System.out.print(vo.getAge()+"\t");
				System.out.print(vo.getGender()+"\t");
				System.out.print(vo.getJoinday().substring(0,10)+"\t");
				System.out.print(vo.getAddress()+"\n");
				return vo.getIdx();
			}
			else 	{
				System.out.println("\n검색 자료 없음");
				return 0;
			}
	}
	
	//회원자료 삭제처리
	public void setDelete(HoewonDAO dao, String name) {
		int res = dao.setDelete(name);
		
		if(res != 0) System.out.println("삭제 완료");
		else System.out.println("삭제할 자료가 없습니다.");
	}
	
	//회원자료 수정
	public void setUpdate(HoewonDAO dao, String name) {
		int idx =	getSearch( dao,  name); //검색 변수를 호출 =>화면에 검색결과 나옴

		if(idx != 0) {
			int choice =0;
			String content = "";
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			while(true) {
				System.out.print("수정할 항목 1.성명 2.나이 3.성별 4.가입일 5.주소 ==> ");
				choice = sc.nextInt();
				System.out.print("수정할 내용 입력 ");
				content = sc.next();
				if(choice ==1) {//동명이인 조회 필요
					vo =  dao.getSearch(content);
					if (vo.getName() == null) break;
					else	System.out.println("같은 이름이 존재합니다. 다른 이름으로 수정하세요. ");			
				}
				else break;
			}
			idx = dao.setUpdate(idx, choice, content);
			if(idx !=0 ) System.out.println(" 회원 자료 수정 완료 ");
			else System.out.println("회원 자료 수정 실패");
		}
	}
}
