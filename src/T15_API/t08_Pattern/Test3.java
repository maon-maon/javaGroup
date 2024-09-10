package T15_API.t08_Pattern;

import java.util.regex.Pattern;

//이메일 만들기
//자릿수 체크
// 글자수 : {시작글자수,종료글자수} - 종료글자수는 생략가능
public class Test3 {
	public static void main(String[] args) {
		String regEx1 = "^[a-zA-Z0-9_]+@[a-zA-Z0-9_-]+.[a-z]+$";
		String regEx2 = "^[a-zA-Z0-9_]{3,}+@[a-zA-Z0-9_-]+.[a-z]+$";//{}로 자릿수제한3,=최소3
		String regEx3 = "^[a-zA-Z0-9_]{3,12}+@[a-zA-Z0-9_-]+.[a-z]+$";
		String regEx4 = "^[a-zA-Z0-9_]{3,12}+@[a-zA-Z0-9_-]{1,8}+.[a-z]+$";
		String regEx5 = "\\w{3,}+@[a-zA-Z0-9_-]{1,8}\\.[a-z]{2,4}";//{제한걸어놓으면 +로 반드시넣음 표시할 필요 없음}
		String regEx6 = "\\w{3,}+@[a-zA-Z0-9_-]+(\\.[a-z]+)+$";//{제한걸어놓으면 +로 반드시넣음 표시할 필요 없음}
//		String regEx6 = "\\w{3,}+@[a-zA-Z]{1,9}\\.[a-zA-z.]{2,8}";
//		String regEx6 = "\\w{4,10}+@\\w{1,15}[a-zA-z.]{2,8}";
		// \\.=나중에.이 문제가 될 수 있어서 \\로 제어코드로 만드는것
		
		String str00 ="";
		String str01 ="atom@naver.com";
		String str02 ="atom1234@naver.com";
		String str03 ="atom!1234@naver.com";
		String str04 ="atom 1234@naver.com";
		String str05 ="atom12344567890@naver.com";
		String str06 ="atom@navernaver.com";
		String str07 ="at@navernaver.com";
		String str08 ="atom@navernaver.comcom";
		String str09 ="atom@naver.co.kr";
		
//		System.out.println("regEx1:str00 "+Pattern.matches(regEx1, str00));
//		System.out.println("regEx1:str01 "+Pattern.matches(regEx1, str01));
//		System.out.println("regEx1:str02 "+Pattern.matches(regEx1, str02));
//		System.out.println("regEx1:str03 "+Pattern.matches(regEx1, str03));
//		System.out.println("regEx1:str04 "+Pattern.matches(regEx1, str04));
//		System.out.println();
//		
//		System.out.println("regEx2:str00 "+Pattern.matches(regEx2, str00));
//		System.out.println("regEx2:str01 "+Pattern.matches(regEx2, str01));
//		System.out.println("regEx2:str02 "+Pattern.matches(regEx2, str02));
//		System.out.println("regEx2:str03 "+Pattern.matches(regEx2, str03));
//		System.out.println("regEx2:str04 "+Pattern.matches(regEx2, str04));
//		System.out.println();
//		
//		System.out.println("regEx3:str00 "+Pattern.matches(regEx3, str00));
//		System.out.println("regEx3:str01 "+Pattern.matches(regEx3, str01));
//		System.out.println("regEx3:str02 "+Pattern.matches(regEx3, str02));
//		System.out.println("regEx3:str03 "+Pattern.matches(regEx3, str03));
//		System.out.println("regEx3:str04 "+Pattern.matches(regEx3, str04));
//		System.out.println("regEx3:str05 "+Pattern.matches(regEx3, str05));
//		System.out.println();
//		
//		System.out.println("regEx4:str00 "+Pattern.matches(regEx4, str00));
//		System.out.println("regEx4:str01 "+Pattern.matches(regEx4, str01));
//		System.out.println("regEx4:str02 "+Pattern.matches(regEx4, str02));
//		System.out.println("regEx4:str03 "+Pattern.matches(regEx4, str03));
//		System.out.println("regEx4:str04 "+Pattern.matches(regEx4, str04));
//		System.out.println("regEx4:str05 "+Pattern.matches(regEx4, str05));
//		System.out.println("regEx4:str06 "+Pattern.matches(regEx4, str06));
//		System.out.println();
//		
//		System.out.println("regEx5:str00 "+Pattern.matches(regEx5, str00));
//		System.out.println("regEx5:str01 "+Pattern.matches(regEx5, str01));
//		System.out.println("regEx5:str02 "+Pattern.matches(regEx5, str02));
//		System.out.println("regEx5:str03 "+Pattern.matches(regEx5, str03));
//		System.out.println("regEx5:str04 "+Pattern.matches(regEx5, str04));
//		System.out.println("regEx5:str05 "+Pattern.matches(regEx5, str05));
//		System.out.println("regEx5:str06 "+Pattern.matches(regEx5, str06));
//		System.out.println("regEx5:str07 "+Pattern.matches(regEx5, str07));
//		System.out.println("regEx5:str08 "+Pattern.matches(regEx5, str08));
//		System.out.println("regEx5:str09 "+Pattern.matches(regEx5, str09));
//		System.out.println();
		
//		System.out.println("regEx6:str09 "+Pattern.matches(regEx6, str09));
//		System.out.println();
		
		System.out.println("regEx6:str07 "+Pattern.matches(regEx6, str07));
		System.out.println("regEx6:str08 "+Pattern.matches(regEx6, str08));
		System.out.println("regEx6:str09 "+Pattern.matches(regEx6, str09));
		System.out.println();
		
		
	}
}
