package T15_API.t07_DateTime;

import java.util.Calendar;
import java.util.TimeZone;

public class T03_TimeZone {
	public static void main(String[] args) {
		//알고싶은 시간대와 타임존 확인 : TimeZone
//		TimeZone tz0 = TimeZone.getTimeZone("Asia/Seoul");
//		Calendar calLa0 = Calendar.getInstance(tz0);
		TimeZone tz = TimeZone.getTimeZone("American/Los_Angeless");
		Calendar calLa = Calendar.getInstance(tz);
		
		System.out.println("LA 현재 날짜 시간");
		System.out.println("날짜 : "+calLa.get(Calendar.YEAR)+"년"+
		(calLa.get(Calendar.MONTH)+1)+"월"+calLa.get(Calendar.DATE)+"일");
		System.out.println("시간 : "+calLa.get(Calendar.HOUR_OF_DAY)+"시"+
		calLa.get(Calendar.MINUTE)+"분"+calLa.get(Calendar.SECOND)+"초");
		
		System.out.println("TimeZone List");
		String[] timezone = TimeZone.getAvailableIDs();
		for(String id : timezone) {
			System.out.println(id);
		}
		
	}
}
