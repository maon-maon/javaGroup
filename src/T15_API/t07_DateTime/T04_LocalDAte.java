package T15_API.t07_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Spliterator;

public class T04_LocalDAte {
	public static void main(String[] args) {
		//날짜 : LocalDate 객체 //서버날짜 동기화
		LocalDate currentDate = LocalDate.now();
		System.out.println("오늘 날짜: "+currentDate);
		
		//날짜 지정 셋팅
		currentDate = LocalDate.of(2024, 12, 25);
		System.out.println("지정날짜 : "+currentDate);
		
		//시스템 시간 : LocalTime //서버시간 동기화
		LocalTime currestTime = LocalTime.now();
		System.out.println("현재시간 : "+currestTime);
		System.out.println("현재시간 : "+currestTime.toString().substring(0,8));//문자로 바꾸고.선택한자리만 출력		
		
		//날짜/시간 : LocalDateTime
		LocalDateTime  currentDateTime = LocalDateTime.now();
		System.out.println("현재 날짜/시간 : "+currentDateTime);
		
//		String SplitDT = currentDateTime+"";
//		String[]  spDT =  LocalDateTime.now().toString().split("T");
//		System.out.println(spDT[0]);
//		System.out.println(spDT[1].substring(0,spDT[1].lastIndexOf(".")));
		
		String[]  spDT =  LocalDateTime.now().toString().split("T");
		System.out.println("현재 날짜/시간 : "+spDT[0]);
		System.out.println("현재 날짜/시간 : "+spDT[1].substring(0,spDT[1].lastIndexOf(".")));
		System.out.println();
		
		
		//날짜연산 : plusYears(), minusYears() +mon -mon +days -day 등등
		LocalDateTime res = currentDateTime.plusYears(1);
		System.out.println("오늘날짜 년도 +1 "+res);
		System.out.println("오늘날짜 년도 +1 "+res.toString().substring(0,4));
		
		res = currentDateTime.minusDays(7);
		System.out.println("오늘날짜 일 -7: "+res.toString().substring(8,10));
		
		
	}
}
