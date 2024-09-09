package T15_API.t04_String;

import java.util.StringTokenizer;

public class T08_Tokenizer {
	public static void main(String[] args) {
		String tel = "010-1234-567";
		
		StringTokenizer tellArr = new StringTokenizer(tel,"-");
		//하이픈 기준으로 분리
		System.out.println("tellArr토큰의 개수 "+tellArr.countTokens());
		System.out.println("---------------");
		
		
		String str = "";
		while(tellArr.hasMoreElements()) {//hasMoreElements()자료 있는지 확인
			str += tellArr.nextElement()+ "/";
		}
		str = str.substring(0, str.length()-1);
		System.out.println("str"+str);
		
	}
}
