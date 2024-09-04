package T08_inheritance;

//출력전담 클래스
public class T02Cc2 extends T2Bb2 {
	
	// 매개변수(flag)에 1이 오면 사각형처리, 2가오면 원을 처리해서 출력한다.
	void prn(int flag, String ans, int res, double res2) {
		String str;
		if(ans.equals("a")) str = "넓이";
		else str = "둘레";
		
		if(flag == 1) {
			// 사각형 넓이/둘레 출력처리
			System.out.println("사각형의 "+str+" 는 "+res+" 입니다.");
		}
		else if(flag == 2) {
			// 원에 넓이/둘레  출력처리
			System.out.println("원의 "+str+" 는 "+res2+" 입니다.");
		}
	}
}