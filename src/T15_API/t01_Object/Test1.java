package T15_API.t01_Object;

import java.util.HashMap;
//hashcode
public class Test1 {
	public static void main(String[] args) {//실행클래스
		//컬렉션 프레임웍(Collection Framework의 한 종류 키(Key)와 Value(값)으로 데이터를 표현: HashMap
		//Generic : 하위 타입을 정의 //객체 안의 타입을 정했다 해서 하위타입(하위타입은 객체로 들어가야 함)
//		HashMap<int, V>=기본타입을사용할 수 없음. 랩퍼클래스를 사용해서 기본타입을 포장해서=박싱=객체타입생성 언박싱=포장해제 해서 사용함
		//int 대신 Integer사용함
//		HashMap<Integer, String> map = new HashMap<Integer, String>();//타입 동일하게
		//배열은 키가 없음=인덱스번호로 불러냄
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "데이터1");
		map.put(1, "데이터2");
		map.put(2, "데이터3");
		System.out.println(map);
		//
		
		HashMap<Aa, String> map2 = new HashMap<>();//객체인 Aa는 넣을 수 잇음
		map2.put(new Aa("첫번째"), "홍길동\n");//(키)배열주소=(밸류)값
		map2.put(new Aa("첫번째"), "김말숙\n");//객체를 찍으면 주소 나옴new Aa("첫번째")
		map2.put(new Aa("두번째"), "이기자\n");
		map2.put(new Aa("두번째"), "이기자\n");
		System.out.println(map2);
		//출력결과 : 객체주소(hashcode)를 통한 자료의 저장/처리
		/* {T15_API.t01_Object.Aa@7852e922=이기자, T15_API.t01_Object.Aa@15db9742=홍길동, 
		 * T15_API.t01_Object.Aa@6d06d69c=김말숙, T15_API.t01_Object.Aa@4e25154f=이기자}
		 */
		//데이터로 비교하면 값이 같으므로 같다고 나옴. 해시코드 비교시 주소값이 다르므로 다르다고 나옴
	}
}

class Aa{//보조클래스
	String name;
	
	public Aa(String name) {
		this.name = name;
	}
}

class Bb{
String name;
	
	public Bb(String name) {
		this.name = name;
	}
}