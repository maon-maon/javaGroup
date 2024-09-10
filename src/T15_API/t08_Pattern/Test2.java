package T15_API.t08_Pattern;

import java.util.regex.Pattern;
//1.정규식생성 2.문자받아 처리
//영문자와 숫자 ^[\\w]*$, ^[a-zA-Z0-9]*$ (동일기능)
//스페이스 체크 중요함
public class Test2 {
	public static void main(String[] args) {
		
		
		String regEx0 = "^[\\d]*$";								// 숫자 체크
		String regEx1 = "^[\\w]*$";								// 영문자와 숫자 체크
		String regEx2 = "^[a-zA-Z0-9]*$";					// 영문자와 숫자 체크
		String regEx3 = "^[a-zA-Z가-힣]*$";	//영문한글// 영문자와 한글체크
		String regEx4 = "^[\\s]*$";	//공백유무				// 공백체크
		String regEx5 = "^[a-zA-Z가-힣 ]*$";				// 영문자와 한글과 공백 
		String regEx6 = "^[a-zA-Z0-9가-힣 _-]*$";		// 이름은 영문자/한글/공백/숫자/밑줄/하이폰 만이 포함된 글자만 허용
		
		String str1 = "hello";
		String str2 = "hello1234";
		String str3 = "hello12!!";
		String str4 = "hello  ";
		String str5 = "안녕";
		String str5_2 = "안 녕";
		String str6 = "   ";
		String str7 = "		";//탭으로 밀면 아스키코드는 값이 달라짐
		String str8 = "		".trim();//trim으로 앞뒤공백 지움
		String str9 = "";//스페이스체크 됨
		String str10 = "한글 avs - _";
		String str11 = "한글 avs - _!";
		
		//regEx1
//		if( Pattern.matches(regEx1, str5))
		//										정규식, 비교할 문자열
		if( Pattern.matches(regEx1, str1)) System.out.println("1.영문자와 숫자로만 구성됨");
		else System.out.println("1.영문자와 숫자가 아닌 구성문자가 포함됨");
		
		//참거짓으로만 나오게 출력해 봄. 영문 숫자가 아니면 false나옴
		System.out.println("2. : "+Pattern.matches(regEx1, str2));
		System.out.println("3. : "+Pattern.matches(regEx1, str3));
		System.out.println("4. : "+Pattern.matches(regEx1, str4));
		System.out.println("5. : "+Pattern.matches(regEx1, str5));
		System.out.println("=================================");
		
	//regEx2
		if( Pattern.matches(regEx2, str1)) System.out.println("11.영문자와 숫자로만 구성됨");
		else System.out.println("11.영문자와 숫자가 아닌 구성문자가 포함됨");
		
		System.out.println("12. : "+Pattern.matches(regEx2, str2));
		System.out.println("13. : "+Pattern.matches(regEx2, str3));
		System.out.println("14. : "+Pattern.matches(regEx2, str4));
		System.out.println("15. : "+Pattern.matches(regEx2, str5));
		System.out.println("=================================");
		
		//값 다르게 나옴 다시 확인
		//regEx3
		if( Pattern.matches(regEx3, str1)) System.out.println("21.이름이 영문과 한글로만 구성됨");
		else System.out.println("21.이름이 영문과 한글이 아닌 구성문자가 포함됨");
		
		System.out.println("22. : "+Pattern.matches(regEx3, str2));
		System.out.println("23. : "+Pattern.matches(regEx3, str3));
		System.out.println("24. : "+Pattern.matches(regEx3, str4));
		System.out.println("25. : "+Pattern.matches(regEx3, str5));
		System.out.println("26. : "+Pattern.matches(regEx3, str5_2));
		System.out.println("27. : "+Pattern.matches(regEx5, str5_2));
		System.out.println("=================================");
		
		
		
	// regEx4
			if(Pattern.matches(regEx4, str1)) System.out.println("31.공백만 구성되어 있다.");
			else System.out.println("31.공백 아닌 구성문자가 포함 되어 있다.");
			
			System.out.println("32. : " + Pattern.matches(regEx4, str2));
			System.out.println("33. : " + Pattern.matches(regEx4, str3));
			System.out.println("34. : " + Pattern.matches(regEx4, str4));
			System.out.println("35. : " + Pattern.matches(regEx4, str5));
			System.out.println("36. : " + Pattern.matches(regEx4, str6));
			System.out.println("37. : " + Pattern.matches(regEx4, str7));
			System.out.println("38. : " + Pattern.matches(regEx4, str8));
			System.out.println("39. : " + Pattern.matches(regEx4, str9));
			System.out.println("=================================");
		
			System.out.println("40. : " + Pattern.matches(regEx6, str10));
			System.out.println("41. : " + Pattern.matches(regEx6, str11));
			System.out.println("=================================");
			
	}
}
