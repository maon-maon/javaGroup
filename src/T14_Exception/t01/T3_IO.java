package T14_Exception.t01;

import java.io.IOException;
import java.io.InputStreamReader;

public class T3_IO {
	public static void main(String[] args) {
		//인풋/아웃풋에서 발생하는 이셉션
		try {
			InputStreamReader is = new InputStreamReader(System.in);//System.in 앞의 한 '문자'만 읽음 바이트만 인식
			
			while(true) {
				System.out.println("업로드할 파일명 입력하세요.(종료시 0 입력)");
				char ch =(char) is.read();
				if(ch=='0') break;
				int intch = ch;
				System.out.println(ch +" : 파일을 정상적으로 읽어들였습니다. intch= "+intch);
			}
		} catch (IOException e) {
			System.out.println("파일을 읽기 실패하습니다.");
			e.printStackTrace();
		}
		System.out.println("작업종료");
	}
}
