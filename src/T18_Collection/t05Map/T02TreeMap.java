package T18_Collection.t05Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//키 값이 순차정렬
public class T02TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		//트리계통의 값 검색은 Map으로는 할 수 없음 반드시 TreeMap으만 사용가능
		
		System.out.println("1.크기 "+map.size());
		System.out.println("1.자료 "+map);//.toString()생략가능 //{}로 나옴. 맵계열 특징
		System.out.println();
		
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
		
		//추가
		map.put(13, "김말자");//데이터 덮어쓰기
		map.put(20, "김말자");//키가 다르면 값은 중복허용
		System.out.println("3.크기 "+map.size());
		System.out.println("3.자료 "+map);
		System.out.println();
		
		//검색 : .get();=>키 값을 검색하여 자료를 찾아줌
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
		
		//키값 검색
		System.out.println("7.첫번째키 : "+map.firstKey());
		System.out.println("7.마지막키 : "+map.lastKey());
		System.out.println("7.첫번째키와값 : "+map.firstEntry());
		System.out.println("7.검색키보다 작은값 : "+map.lowerKey(18));
		System.out.println("7.검색키보다 큰키 : "+map.higherKey(18));
		System.out.println("7.검색키보다 큰키의 값 : "+map.get(map.higherKey(18)));
		System.out.println();
		
		//모두 삭제 :clear
		map.clear();
		System.out.println("7.크기 "+map.size());
		System.out.println("7.자료 "+map);
		System.out.println();
	}
}
