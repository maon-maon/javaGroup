package T15_API.t04_String;
//문자(한글자)='' : 찾음
public class T01_chatAt {
	public static void main(String[] args) {
		//              0         1
		//              01234567890123
		String jumin = "123456-1234567";
		char gender = jumin.charAt(7);
		String strGender ="";
		
		if(gender == '1'|| gender =='3') strGender ="남자";
		else if(gender == '2'|| gender =='4') strGender = "여자";
		else strGender ="오류";
		
		System.out.println("주민번호 : "+jumin+", 성별 : "+strGender);
	}
}
