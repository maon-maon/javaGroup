package T08_inheritance;

import java.util.Scanner;

/*
 * 면적을 계산한다.
 * T02Aa클래스는 사각형 면적/둘레를 구함
 * T02Bb클래스는 원의 면적/둘레를 구함
 * T02Cc클래스는 출력전담 클래스이다.
 */
public class T02Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T02Cc cc = new T02Cc();
		int su, flag, w,h,r;
		
		
		System.out.println("사각형을 구하려면 1, 원을 구하려면 2를 입력");
		flag = sc.nextInt();
		
		if(flag==1)
			System.out.println("가로를 입력하세요");
			w= sc.nextInt();
			System.out.println("세로를 입력하세요");
			h= sc.nextInt();
//			int resSqu =cc.prn(flag);
			
			
		
		
		sc.close();
	}
}
