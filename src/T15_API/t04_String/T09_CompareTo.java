package T15_API.t04_String;

import java.util.Objects;

public class T09_CompareTo {
	public static void main(String[] args) {
		String a = "Seoul";
		String b = "seoul";
		String c = a+b;
		System.out.println("c : "+c);		
		
		//compareTo():문자열비교(0:동일한 문자열, 음수:앞의 문자열이 작다. 양수:앞의 문자열이 크다)
		System.out.println(a.compareTo(b));//a=65아스키코드
		System.out.println(a.compareTo(c));
		System.out.println(c.compareTo(a));
		
		
		//공백비교 : equals(),(isBlank()=자바10이상,) isEmpty()
		System.out.println("1.c가 공백? "+c.equals(""));
//		System.out.println("2.c가 공백? "+c.isBlank(""));
		System.out.println("3.c가 공백? "+c.isEmpty());
		System.out.println("4.c가 null? "+Objects.isNull(c));
		
	}
}
