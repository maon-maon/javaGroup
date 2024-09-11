package T18_Collection.t05Map;

import java.util.HashMap;
import java.util.Map;

/*
 Map계열 자료구조 : 사전식자료구조, Web에서의 JSON데이터형식과 같다.
 순서와 관계없다. '키'와 '값'으로 구성된 자료구조이다. 자료'검색/삭제/수정'시에 '키'를 이용한다.
  중복 => '키'는 중복불가, '값'은 중복가능
 */
//키는 인덱스번호 아님 다름
public class T01HashMap_ {
	public static void main(String[] args) {
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map = new HashMap<>();
//		Map<Integer, String> map = new HashMap<>();
		
		System.out.println("1.크기 "+map.size());
		System.out.println("1.자료 "+map);//.toString()생략가능 
		System.out.println();
	  //{}로 나옴. 맵계열 특징
		
		
		//자료 삽입 : put(키, 값)
		map.put(11, "홍길동");
		map.put(13, "김말숙");
		map.put(21, "이기자");
		map.put(15, "강감찬");
		map.put(17, "오사랑");
		map.put(19, "고인돌");
		System.out.println("2.크기 "+map.size());
		System.out.println("2.자료 "+map);//.toString()생략가능 //{}로 나옴. 맵계열 특징
		System.out.println();
		//키와 값 사이 =가 자동출력
		
		//추가
		map.put(13, "김말자");//데이터 덮어쓰기=수정
		map.put(20, "김말자");//키가 다르면 값은 중복허용=신규추가
		System.out.println("3.크기 "+map.size());
		System.out.println("3.자료 "+map);
		System.out.println();
		
		//검색 : .get();
		System.out.println("4.검색키(13) "+map.get(13));
		System.out.println();
		
		//수정 : put()
		map.put(13,"이사랑");//값 넣고 보여주는 방식이 맞음
//		System.out.println("5.검색키(13) "+map.put(13,"이사랑"));//이렇게하면 현재 13번이 출력되고 그 위치에 신규값을 넣게 됨
		System.out.println("5.크기 "+map.size());
		System.out.println("5.자료 "+map);
		System.out.println();
		
		//삭제 : remove
		map.remove(13);
//		System.out.println("6.검색키(13) "+map.remove(13));
		System.out.println("6.크기 "+map.size());
		System.out.println("6.자료 "+map);
		System.out.println();
			
		//모두 삭제
		map.clear();
		System.out.println("7.크기 "+map.size());
		System.out.println("7.자료 "+map);
		System.out.println();
	}
}
