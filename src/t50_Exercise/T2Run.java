package t50_Exercise;

import java.util.Scanner;

/*
 *'성명(name)/나이(age)/지역(address)/성별(gender)'을 입력받아 고객 정보를'정장/출력'
 * 나이는 20 이상 90미만 가입가능,
 * 주소입력시 '외국인'은 0으로 입력
 * 성별 '남자 1,3' , '여자는 2,4'로 입력 후 , 저장은 '남자/여자'로
 * 저장된 자료를 출력시켜볼 수 있게 처리한다.
 */
public class T2Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name, addres, gender;
		int age, sex;
				
		System.out.print("성명 입력하세요");
		name = sc.next();
		System.out.print("나이 입력하세요");
		age = sc.nextInt();
		System.out.print("주소 입력하세요(외국인은0입력)");
		addres = sc.next();
		System.out.print("성별 입력하세요(남자:1,3/여자:2,4)");
		sex = sc.nextInt();
		
		T2VO vo = new T2VO();
		vo.setName(name);
		while(true) {
			boolean ageCheck = vo.setAge(age);
			if(ageCheck)  break;
			
			System.out.print("나이 입력하세요");
			age = sc.nextInt();
		}	
		vo.setAddress(addres);
		vo.setGender(sex);
		
		T2_Service service = new T2_Service();
//		service.t2Print(name,age,addres,);
		service.t2Print(vo);
		
		sc.close();
	}
}
