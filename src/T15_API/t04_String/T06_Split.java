package T15_API.t04_String;

public class T06_Split {
	public static void main(String[] args) {
		//Split : 문자열을 특자 문자(열)로 분리 후-> 각각의 항목이 배열로 저장시켜줌.(or : |)
		
		String tel = "010-1234-5678";
		
		//앞의 전화번호를'-'로 분리시킨 후 배열로 저장
		String[] telArr = tel.split("-");
		System.out.println("지역번호 : "+telArr[0]);
		System.out.println(" 국번호 : "+telArr[1]);
		System.out.println("전화번호 : "+telArr[2]);
		System.out.println();
		
		String temp = "";
		for(String t : telArr) {
//			System.out.println(t);
			temp += t +"/";
		}
		temp = temp.substring(0,temp.length()-1);//마지막 슬래시 제외
		System.out.println(temp);
		System.out.println();
				//각 이름의 구분자를 '/'로 통일해서 출력
		String names = "홍길동/김말숙&이기자:오하늘;소나무 고인돌";
		System.out.println(names);
		
		String[]  namesArr =names.split("/|&|:|;| ");
		String nameTemp = "";
		for(String name :namesArr ) {
			nameTemp +=name+"/";
		}
		nameTemp = nameTemp.substring(0,nameTemp.length()-1);
		System.out.println(nameTemp);
		System.out.println();
		
		//join(): 배열에 분리저장되어 있는 항목들을 특정 문자로 결합 
		String nameJoin = String.join("/", namesArr);// /로 모든 문자를 결합해서 출력
		System.out.println("이름 : "+nameJoin);
		
	}
}
