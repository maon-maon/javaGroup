package T14_Exception.t01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T1_ClassNotFound {
	public static void main(String[] args) {

		
			try {
				FileInputStream fis = new FileInputStream("test.txt");
			System.out.println("test.txt 파일이 존재합니다.");
			} catch (FileNotFoundException e) {//e.도 화면에 보여줌 여기선test.txt
//				e.printStackTrace();
				System.out.println("test.txt 파일이 없습니다."+e.getMessage());
			}
			System.out.println("작업끝");
	}
}
