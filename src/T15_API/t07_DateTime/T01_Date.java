package T15_API.t07_DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class T01_Date {
	public static void main(String[] args) {
		//Date객체
		Date now =new Date();
		System.out.println("1.오늘 날짜 (기본형식): "+now);
		
		//날짜객체를 문자와 : to String() //문자로 형변환
		String strnow = now.toString();
		System.out.println("2.오늘 날짜 (문자형식): "+strnow);
		
		//날짜형식을 사용자 지정에 따른 변경 : SimpleDateFormat()
		//매개변수형식 : 년도(yy,yyyy), 월(M), 일(d), 시간(h,H), 분(m), 초(s), 요일(E), 1월1일부터 오늘까지의 날수(D)
		SimpleDateFormat sdf = new SimpleDateFormat();//SimpleDateFormat();<=괄호안에 표시하려는 양식 넣어서 씀
		String strnow1 =  sdf.format(now);
		System.out.println("3. 기본 날짜 시간 포멧: "+strnow1);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		strnow1 = sdf.format(now);
		System.out.println("4. yyyy-MM-dd 포멧: "+strnow1);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		strnow1 = sdf.format(now);
		System.out.println("5. yyyy-MM-dd 포멧: "+strnow1);
		
		sdf = new SimpleDateFormat("hh:mm:ss");//12시간제(AM,PM)
		strnow1 = sdf.format(now);
		System.out.println("6. hh:mm:ss: "+strnow1);
		
		sdf = new SimpleDateFormat("HH:mm:ss ");//24시간제
		strnow1 = sdf.format(now);
		System.out.println("7.HH:mm:ss: "+strnow1);
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		strnow1 = sdf.format(now);
		System.out.println("8. 오늘은 E요일: "+strnow1);
		
		sdf = new SimpleDateFormat("오늘은 올해의 D번째일");
		strnow1 = sdf.format(now);
		System.out.println("9. 오늘은 올해의 D번째일: "+strnow1);
		
		sdf = new SimpleDateFormat("오늘은 이번 달의 d번째일");
		strnow1 = sdf.format(now);
		System.out.println("10. 오늘은 이번 달의 d번째일: "+strnow1);
		
		sdf = new SimpleDateFormat("E, d MMM YYYY HH:mm:ss");
		strnow1 = sdf.format(now);
		System.out.println("11. E, d MMM YYYY HH:mm:ss: "+strnow1);
		
		sdf = new SimpleDateFormat("E, d MMM YYYY HH:mm:ss", Locale.CANADA);
		strnow1 = sdf.format(now);
		System.out.println("12. E, d MMM YYYY HH:mm:ss: "+strnow1);
		
	}
}
