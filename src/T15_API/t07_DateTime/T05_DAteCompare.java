package T15_API.t07_DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
//최근 양식 5년 전 파일은 모두 이거 이전걸로 되어 있음. T04걸로
//날짜는 던져도 됨
public class T05_DAteCompare {
	public static void main(String[] args) throws ParseException {
		LocalDateTime startDateTime = LocalDateTime.now();
		LocalDateTime ensDateTime = LocalDateTime.of(2024, 12, 31, 0, 0, 0);
		
		System.out.println("남은 월 :"+(startDateTime.until(ensDateTime, ChronoUnit.MONTHS)));
		System.out.println("남은 일 :"+(startDateTime.until(ensDateTime, ChronoUnit.DAYS)));
		System.out.println("남은 시간 :"+(startDateTime.until(ensDateTime, ChronoUnit.HOURS)));
		System.out.println();
		
		String strDate1 = "2024-09-11";
		String strDate2 = "2024.09.10";// 

//		SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd").format();
//		String date1 = new SimpleDateFormat("yyyy-MM-dd").format();
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(strDate1);//파싱은 던져놀고 쓰는거 가능. 오류 트라이캐치 안 함. 날짜는 던져도 됨
		Date date2 = new SimpleDateFormat("yyyy.MM.dd").parse(strDate2);
		//문자 타입은 비교 불가능함. 데이트 타입으로 바꿔서 비교해야함
		
		if(date1.getTime()>date2.getTime()) System.out.println("strDate1이 크다");
		else System.out.println("strDate2가 크다");
		System.out.println();
		
//		long res1 = date1.getTime()-date2.getTime();
//		System.out.println("res1: "+res1);
		long res = (date1.getTime()-date2.getTime())/1000;//초단위로 나타내기 위해
		System.out.println("res: "+res+"초");
		
		res = (date1.getTime()-date2.getTime())/(1000*60);//분
		System.out.println("res: "+res+"분");
		
		res = (date1.getTime()-date2.getTime())/(1000*60*60);//시간
		System.out.println("res: "+res+"시간");
		
		res = (date1.getTime()-date2.getTime())/(1000*60*60*24);//일
		System.out.println("res: "+res+"일");
		
		
		
	}
}
