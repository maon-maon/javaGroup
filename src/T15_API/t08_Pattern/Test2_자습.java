package T15_API.t08_Pattern;

import java.util.Scanner;
import java.util.regex.Pattern;
//1.정규식생성 2.문자받아 처리
//영문자와 숫자 ^\\w*$, ^[a-zA-Z0-9]*$ (동일기능)
//스페이스 체크 중요함
public class Test2_자습 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("사용하려는 아이디를 입력하세요.(영문,숫자만 가능)");
			String str1 = sc.next();
			
			String regEx1 ="^[\\w]*$";
			System.out.println("=============");
			
			while(true) {
				if( Pattern.matches(regEx1, str1)) {
					System.out.println("사용할 수 있습니다.");
					break;
				}
				else System.out.println("사용할 수 없습니다.");
				System.out.println("=============");
				System.out.println();
			}
			
			System.out.println("사용하려는 닉네임을 입력하세요.(영문,숫자,한글만 가능)");
			String str2 = sc.next();
			
			String regEx2 ="^[\\w가-힣]*$";
			System.out.println("=============");
			
			if( Pattern.matches(regEx2, str2)) System.out.println("사용할 수 있습니다.");
			else System.out.println("사용할 수 없습니다.");
			System.out.println("=============");
		
		
		
//		String regEx1 = "^[\\w]*$";								// 영문자와 숫자 체크
//		String regEx2 = "^[a-zA-Z0-9]*$";					// 영문자와 숫자 체크
//		String regEx3 = "^[a-zA-Z가-힣]*$";	//영문한글// 영문자와 한글체크
//		String regEx4 = "^[\\s]*$";	//공백유무				// 공백체크
//		String regEx5 = "^[a-zA-Z가-힣 ]*$";				// 영문자와 한글과 공백 
//		String regEx6 = "^[a-zA-Z0-9가-힣 _-]*$";		// 이름은 영문자/한글/공백/숫자/밑줄/하이폰 만이 포함된 글자만 허용
		
//		String str1 = "hello";
//		String str2 = "hello1234";
//		
//		String str7 = "		";//탭으로 밀면 아스키코드는 값이 달라짐
//		String str8 = "		".trim();//trim으로 앞뒤공백 지움
//		String str9 = "";//스페이스체크 됨
//		String str10 = "한글 avs - _";
//		String str11 = "한글 avs - _!";
		
		//regEx1
//		if( Pattern.matches(regEx1, str5))
		//										정규식, 비교할 문자열
	
	 sc.close();
	}
}
