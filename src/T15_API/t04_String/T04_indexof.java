package T15_API.t04_String;

public class T04_indexof {
	public static void main(String[] args) {
		
//							 0         1					2
//               012345678901234567890123
		String msg1 ="Welcome to Korea!!!";
		String msg2 ="한국을 방문하신것을 환영합니다.";
		
		
		//indexof : 찾고자 하는 문자(열)이 있는가? 있으면 위치값(인덱스값)을 반환, 없으면 -1을 반환
		System.out.println("1.msg1에 'o '문자가 있는가 "+msg1.indexOf("o"));
		System.out.println("2.msg1에 'O'문자가 있는가 "+msg1.indexOf("O"));
		System.out.println("3.msg1에 'korea'가 있는가? "+msg1.indexOf("korea"));
		System.out.println("4.msg1에 'Korea'가 있는가? "+msg1.indexOf("Korea"));
		
		//indexOf(a,b) : b위치 이후부터 검색하시오.
		System.out.println("5.msg1에 2번째로 등장하는 'o'의 위치값은? "+msg1.indexOf("o",msg1.indexOf("o")+1));
		
		
		
		//lastIndexOf
		System.out.println("6.msg1에 'o '문자를 찾되 뒤부터 검색 후 몇번째인가? "+msg1.lastIndexOf("o"));

		//한글검색
		System.out.println("7.msg2에 '을'의 위치는? "+msg2.indexOf("을"));
		System.out.println("7.msg2에 '환영'의 위치는? "+msg2.indexOf("환영"));
	}
}
