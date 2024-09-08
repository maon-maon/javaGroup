package T14_Exception.t01;
//숫자 변환 오류
public class T7_NumberFormat {
	public static void main(String[] args) {
		String strNo ="1234";
		String strNo2 ="1234o";
		
		int num = Integer.parseInt(strNo);//문자형식의 숫자를 숫자로 바꾸는 명령어 래퍼클래스
		System.out.println(num+1000);
		System.out.println("=====================");
		
		try {
			num = Integer.parseInt(strNo);
			System.out.println(num+1000);
			System.out.println("정상");
			
		} catch (NumberFormatException e) {
			System.out.println("숫자 변환 오류 : "+e.getMessage());
		} finally {
			System.out.println("작업끝");
			System.out.println("=====================");
		}
		
		try {
			num = Integer.parseInt(strNo2);
			System.out.println(num+1000);
			System.out.println("정상");
			
		} catch (NumberFormatException e) {
			System.out.println("숫자 변환 오류 : "+e.getMessage());
		} finally {
			System.out.println("작업끝");
		}
	}
}
