package T15_API.t04_String;

public class T03_getChars {
	public static void main(String[] args) {
		String str1 = "Hello!";//1.문자열을
		
		char[] strArr = new char[str1.length()];//2.하나하나 쪼개서 배열로 받음
		str1.getChars(0, str1.length(), strArr, 0);//배열복사와 같은 개념.
//		str1.getChars(0, str1.length(), strArr, 0);
			//					시작점  받는 길이 				마지막
		System.out.println("strArr : " +strArr);//배열이름찍음=주소가 나옴
		
		String temp = "";
		for(char str  : strArr) {
			temp+= str + "/";
		}
		System.out.println("temp : " + temp);
		System.out.println(temp.substring(0,temp.length()-1));
		//substring(0,0)글자의0번부터 0번까지 선택해서 출력
		
	}
}


