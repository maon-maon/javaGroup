package T15_API.t08_Pattern;

import java.util.regex.Pattern;

/*
 	정규식 Pattern클래스 사용
 	- 정규식을 만들고 메소드와 함께 사용.
 */
public class Test1 {
	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "1A234";
		
		//정규식 만들기 교재547p참고 ppt33,34
		//regEx 레귤러익스프레션
		String regEx = "^[\\d]*$";//이게 중요함
		
		//1번 방법 : 예전방법
	boolean pattern1 = Pattern.compile(regEx).matcher(str1).find();//참과거짓=비교라서 불리언함수로 받아야 함
	boolean pattern2 = Pattern.compile(regEx).matcher(str2).find();
	System.out.println("1.pattern1 "+pattern1);
	System.out.println("2.pattern2 "+pattern2);
	System.out.println();
	
	//2번 방법: 바뀐 방법
	boolean pattern3 = Pattern.matches(regEx,str1);
	boolean pattern4 = Pattern.matches(regEx,str2);
	System.out.println("3. "+pattern3);
	System.out.println("4. "+pattern4);
	System.out.println();
	
	System.out.println("5. "+Pattern.matches(regEx,str1));
	System.out.println("6. "+Pattern.matches(regEx,str2));
	System.out.println();
	
	//프로그램에서 적용
	if(Pattern.matches(regEx,str1))System.out.println("str1은 숫자가 맞습니다.");
	else System.out.println("str1은 숫자가 아닙니다.");
	
	}
}
