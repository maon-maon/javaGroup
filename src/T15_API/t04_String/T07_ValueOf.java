package T15_API.t04_String;

import java.util.HashMap;

public class T07_ValueOf {
	public static void main(String[] args) {
		//string.valueof() : ~~자료형들을 '문자열'로 변환
		
		int su =1234;
//		double dbSu =1234.0;
		
		//객체타입 첫글자=대문자 ,래퍼클래스
		Integer intSu = 1234;
		Double dbSu =1234.0;
		String strSu="1234";
		HashMap<String,	Integer> map = new HashMap<>();

		System.out.println(su);
		System.out.println(strSu);
		System.out.println(intSu);
		System.out.println(strSu.getClass().getName());
		System.out.println(intSu.getClass().getName());
		System.out.println(dbSu.getClass().getName());
		System.out.println(map.getClass().getName());
		System.out.println();
		
		
		int intsu2 =1234;
		System.out.println("1.intSu + 100 : "+(intSu+100));
//		String strSu2 = (String)intsu2;//x String strSu2이게 객체타입이라 변환 불가능
//		String strSu3 = intsu2.tostring();
		String strSu2 = intsu2+"";
		strSu2 = intsu2+100+"";
		System.out.println("strSu2 "+strSu2);
		strSu2 = ""+intsu2 +100;
		System.out.println("strSu2 "+strSu2);
		
		
		//문자열로 변화... valueof()
//		String strsu3 = String.valueOf( intsu2);
//		System.out.println(strsu3.getClass().getName());
		String strsu3 = String.valueOf(intsu2);
		System.out.println(strsu3.getClass().getName());
		
		
		double dbsu4 =3.14;
		String strsu4 = String.valueOf(dbsu4);
		System.out.println(strsu4.getClass().getName());
		
		int a1 =100, a2=200;
		int res = a1+a2;
		System.out.println("res: "+res);
		
		
		String str5 = String.valueOf(a1)+String.valueOf(a2);
		System.out.println(str5);
		System.out.println();
		
//		int res = (int)String.valueOf(a1)+(int)String.valueOf(a1); //x
		res =  Integer.parseInt(String.valueOf(a1))+ Integer.parseInt(String.valueOf(a2));
		System.out.println(res);
		
	}
}
