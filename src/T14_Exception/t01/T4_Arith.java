package T14_Exception.t01;
//계산오류
public class T4_Arith {
	public static void main(String[] args) {
		int su1=10, su2=0;
		
		try {
			System.out.println("정상처리");
			System.out.println("10 / 0 = "+(su1/su2));
		} catch (ArithmeticException e) {
			System.out.println("연산오류 : "+e.getMessage());
		}
		
		System.out.println("작업끝");
	}
}
