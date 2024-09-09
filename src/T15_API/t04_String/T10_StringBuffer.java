package T15_API.t04_String;

/*
 =>mutable(가변적) / immutable(불가변=고정)
 앞의 내용이 변할 떄 영향을 주면 뮤터블 안주면 이뮤터블
 String객체 : immutable객체로서 class가 한 번 생성되면 그 값을 유지함 주로 깗은 문자열 처리에 적당
 StringBuffer객체 : mutable 객체로서 크기를 변경할 수 있다. 동기화를 제공. 멀티스레드 제공 및 사용하기 적절. 가변길이 문자열에 적당.
 :기본저장소 16개 +그때그떄 필요량
 ex)배열에서 몇 개를 사용할지 모르는 상황에서 사용함
 StringBuilder객체 :mutable 객체로서 크기를 변경할 수 있다. 동기화를 제공 불분명. 가변길이에 문자열에 가장 적당.
 성능 : StringBuilder> StringBuffer>>> String
 */
public class T10_StringBuffer {
	public static void main(String[] args) {
		String str = new String("홍길동");//기본크기로 잡힘
		System.out.println("1.str "+str);
		
		str+="/홍길2";
		System.out.println("2.str "+str);
		
		//StringBuffer()객체 : 가변길이 클래스 기본크기 16, 넘칠때는 상황에 따라 크기 변경
		//값의 추가: append, 특정위치삽입 insert, 특정위치부터 지정개수만큼지우기:deldte, 치환 :replace
		//현재 버퍼의 크기? capacity()
		StringBuffer str2 = new StringBuffer();//최초 16을 준비하고 있다가 잡음=안정적
		System.out.println("3.str2버퍼크기 " +str2.capacity());
		str2.append("atom");
		System.out.println("4.str2 : "+str2);
		System.out.println("5.str2버퍼크기 " +str2.capacity());
		
		str2.append("123456789123456789");
		System.out.println("6.str2 : "+str2);
		System.out.println("7.str2버퍼크기 " +str2.capacity());
		
		//
		str2.insert(2, "/abcdefg/");
		System.out.println("7.str2 : "+str2);
		System.out.println("8.str2버퍼크기 " +str2.capacity());
		
		str2.delete(5, 20);//자료를 지워도 늘어난 크기는 줄어들지 않음
		System.out.println("9.str2 : "+str2);
		System.out.println("10.str2버퍼크기 " +str2.capacity());
		
		
		
	}
}
