package T14_Exception.t01;

public class T8_MultiException {
	public static void main(String[] args) {
		//두개 이상의 오류 발생시
		
//		int su1 = Integer.parseInt(args[0]);
//		int su2 = Integer.parseInt(args[1]);
//		int su3 = Integer.parseInt(args[2]);
		
		try {
			String date0 =args[0];
			String date1 =args[1];
			int res = Integer.parseInt(date0)+Integer.parseInt(date1);
			String date2 =args[2];
			
			res = Integer.parseInt(date0)+Integer.parseInt(date1)+Integer.parseInt(date2);
			System.out.println("res : "+res);
		} catch (NumberFormatException e) {
			System.out.println("숫자 변환 오류  : "+e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("데이터 개수 오류 : " +e.getMessage());
		} catch (Exception e) {
			System.out.println("오류 체크하세요");
		}
		
		
//		System.out.println("su1 : "+su1 +" su2 : "+su2+" su3 : "+su3);
		System.out.println("작업끝");
		
	}
}
