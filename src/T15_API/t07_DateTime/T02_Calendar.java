package T15_API.t07_DateTime;

import java.util.Calendar;
//캘린더 객체에서 월은 하나 적게 나옴 무조건+1 필요함
public class T02_Calendar {
	public static void main(String[] args) {
	  Calendar cal = Calendar.getInstance();//싱글톤은 메소드로 접근 겟 사용. 상수는 모두 스테이틱이라 객체명으로 접근
		System.out.println("년도: "+cal.get(Calendar.YEAR) );
		System.out.println("월"+(cal.get(cal.MONTH)+1));//하나 더 작게 나옴
		System.out.println("일: "+cal.get(Calendar.DATE) );
		System.out.println("시(12시간제): "+cal.get(Calendar.HOUR) );
		System.out.println("분: "+cal.get(Calendar.MINUTE) );
		System.out.println("초: "+cal.get(Calendar.SECOND) );
		System.out.println("시(24시간제): "+cal.get(Calendar.HOUR_OF_DAY) );
		System.out.println("AM/PM: "+cal.get(Calendar.AM_PM));//0=AM 1=PM
		System.out.println("오늘은 무슨 요일?" +cal.get(Calendar.DAY_OF_WEEK));//일:1,월:2,화:3,수4,목5,금6,토7
		System.out.println();
		
		int ampm = cal.get(Calendar.AM_PM);
		String strAmPm = ampm == 0?"오전":"오후";
		System.out.println("지금은 "+strAmPm+"입니다");
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strweek = "";
		switch (week) {
			case 1: strweek = "일"; 	break;
			case 2: strweek = "월"; 	break;
			case 3: strweek = "화"; 	break;
			case 4: strweek = "수"; 	break;
			case 5: strweek = "목"; 	break;
			case 6: strweek = "금"; 	break;
			case 7: strweek = "토"; 	break;
		}
		System.out.println("오늘은 "+strweek+"요일입니다.");
	}
}
