package T15_API.t04_String;

import java.io.UnsupportedEncodingException;

//2진열
public class T02_getBytes {
	public static void main(String[] args) {
		//아스키코드 : 영문 1글자를 1Byte, 한글은 2Byte
		//EUC-KR : 영문 1글자를 1Byte, 한글은 2Byte//유럽식
		//유니코드 : UTF-8은 영문 1글자를 1Byte, 한글은 3Byte
		String str1 ="Hello!";
		String str2 ="안녕하세요!";
		
		System.out.println("str1의 길이 : " +str1.length());
		System.out.println("str2의 길이 : " +str2.length());
		//자바에서 한글을 1바이트로 봄 부호!는 1바이트로 봄
		
		byte[] b1 = str1.getBytes();
		System.out.println("b1의 길이 : "+b1.length);
		//getBytes=바이너리로 들어오는걸 바이트로 바꿔줌. 각 글자를 배열로 받아야함
		
		byte[] b2 = str2.getBytes();
		System.out.println("b1의 길이 : "+b2.length);
		//(3byte*5글자) + (!=1바이트 *1글자) =16
		
		//인코딩/디코딩 : 바꿔주는 인코딩/ 돌려놓는 디코딩
//		str2.getBytes("EUC-KR");//을 트라이캐치 자동완성 시킴
		try {
			//EUC-KR 인코딩 <-->디코딩
			byte[] b3 = str2.getBytes("EUC-KR");	//인코딩= 암호화
			System.out.println("b3의 길이 : "+b3.length);
			System.out.println("b3 : "+b3.toString());
			System.out.println("b3[0] "+b3[0]+b3[1]+b3[2]);
			System.out.println("전송중------");
			String str3 = new String(b3,"EUC-KR");//디코딩=복구화
			System.out.println("str3 : "+str3);
			System.out.println();
			
			//UTF-8 인코딩 <-->디코딩
			byte[] b4 = str2.getBytes("UTF-8");	//인코딩= 암호화
			System.out.println("b4의 길이 : "+b4.length);//(2바이트*5글자)+(1바이트*1글자(!)=11
			System.out.println("b4 : "+b4.toString());
			System.out.println("b4[0] "+b4[0]+b4[1]+b4[2]);
			System.out.println("전송중------");
//			String str4 = new String(b4,"UTF-8");//디코딩=복구화
			String str4 = new String(b4,"EUC-KR");//보내는것과 받는게 다르면 문자가 꺠짐str4 : �������몄��!
			System.out.println("str4 : "+str4);
			System.out.println();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
