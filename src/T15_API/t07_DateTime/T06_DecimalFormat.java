package T15_API.t07_DateTime;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class T06_DecimalFormat {
	public static void main(String[] args) {
		//DecimalFormat() : 데이터 출력 포멧을 지정함.(소수이하 자리 처리에서 많이 사용)
		//서식기호 : 0(숫자-자리확보), #(숫자-의미없는 0은 표시 안 함)
		double su =12345.0;
		System.out.println("원본 : "+su);
		
		//일반적으로 1.사용
		DecimalFormat df = new DecimalFormat(); //쉼표 자동 삽입
		System.out.println("1. "+df.format(su));//기본형식:12,345
		
		df = new DecimalFormat("0");//형식을 "0"으로 지정함 ()안에 형식지정할 수있음
		System.out.println("2. "+df.format(su));//12345
		
		df = new DecimalFormat("0,000");
		System.out.println("3. "+df.format(su));//12,345
		
		df = new DecimalFormat("0,000,000");//자리확보
		System.out.println("4. "+df.format(su));// 0,012,345
		
		df = new DecimalFormat("#");//앞에 쓸모없는 0 지움
		System.out.println("5. "+df.format(su));// 12345
		
		df = new DecimalFormat("#,###");
		System.out.println("6. "+df.format(su));// 12,345
		
		df = new DecimalFormat("@@@@@@@@.0");//남는자리 @로 채워서 출력해라
		System.out.println("7. "+df.format(su));// 12,345
		
		// \u00A4:유니코드￦ 표시
		df = new DecimalFormat("\u00A4#.0");//  
		System.out.println("8. "+df.format(su));// ￦12,345

		//US달러표시 -참고용 
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
//		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(su));
		 nf = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(nf.format(su));
		nf = NumberFormat.getCurrencyInstance(Locale.CHINESE);
		System.out.println(nf.format(su));
	}
}
