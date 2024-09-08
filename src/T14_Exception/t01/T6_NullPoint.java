package T14_Exception.t01;

public class T6_NullPoint {
	public static void main(String[] args) {
		//						01234
		String str = "Seoul";
		String str2 = null;
		
		System.out.println("Seoul의 인덱스2에 있는 o를 출력 : "+ str.charAt(2));
		System.out.println("===================");
		
		try {
			System.out.println("o : "+ str.charAt(2));
			System.out.println("정상처리");
		} catch (NullPointerException e) {
			System.out.println("널값 오류 : "+e.getMessage());
		}finally {
			System.out.println("작업끝");
		}
		System.out.println("===================");
		
		try {
			System.out.println("o : "+ str2.charAt(2));
			System.out.println("정상처리");
		} catch (NullPointerException e) {
			System.out.println("널값 오류 : "+e.getMessage());
		}finally {
			System.out.println("작업끝");
		}
	}
}
