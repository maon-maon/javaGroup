package T08_inheritance;

import java.util.Scanner;

/*
 * 면적을 계산한다.
 * T02Aa클래스는 사각형 면적/둘레를 구함
 * T02Bb클래스는 원의 면적/둘레를 구함
 * T02Cc클래스는 출력전담 클래스이다.
 */
public class T02Run2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T02Cc2 cc = new T02Cc2();
		int choice = 0, w, h, r, resRect;
		double resCircle;
		
		while(true) { 
			System.out.println("작업할 번호를 입력하세요?");
			System.out.print("1:사각형넓이, 2:사각형둘레, 3:원넓이, 4:원둘레, 0:종료? ");
			choice = sc.nextInt();
			if(choice==1 || choice==2) {
				System.out.print("사각형의 폭 : ");
				w = sc.nextInt();
				System.out.print("사각형의 높이 : ");
				h = sc.nextInt();
				
				resRect = cc.areaRec(w, h);
				cc.prn(1, "a", resRect, 0.0);
				
				resRect = cc.lenRec(w, h);
				cc.prn(1, "l", resRect, 0.0);
			}
			else if(choice==3 || choice==4) {
				System.out.print("원의 반지름 : ");
				r = sc.nextInt();
				
				resCircle = cc.areaCircle(r);
				cc.prn(2, "a", 0, resCircle);
			}
			else {
				break;
			}
		}
		System.out.println("작업끝...");
		sc.close();
	}
}