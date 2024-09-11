package T18_Collection.t03Array;

import java.util.ArrayList;
import java.util.List;

//인덱스개념 =벡터와동일
 
public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
//		List<String> array = new ArrayList<String>();

		
//		System.out.println("1.array용량  : "+array.capacity());//나중에 나온자료구조라서 못 씀
		System.out.println("1.array크기  : "+array.size());//.size배열의 크기(=배열의 길이)
		System.out.println("1.array문자  : "+array.toString());//문자화
		System.out.println("1.array  : "+array);//생략가능
		System.out.println();
		
		//자료삽입
		array.add("홍길동");
		array.add("김말숙");
		array.add("이기자");
		array.add("오하늘");
		array.add("고인돌");
		array.add("소나무");
		System.out.println("2.array크기  : "+array.size());
		System.out.println("2.array  : "+array);
		System.out.println();
		
		array.add("홍길동3");
		array.add("김말숙3");
		array.add("이기자3");
		array.add("오하늘3");
		array.add("고인돌3");
		array.add("소나무3");
		System.out.println("3.array크기  : "+array.size());
		System.out.println("3.array  : "+array);
		System.out.println();
		
		//자료검색(get)
		System.out.println("4.array.get(1) : "+array.get(1));
		System.out.println("4.array.get(5) : "+array.get(5));
		System.out.println("4.array.get(마지막위치) : "+array.get(array.size()-1));
		System.out.println();
		
		//자료수정(set)
		array.set(1, "강감찬");
		System.out.println("4.array크기  : "+array.size());
		System.out.println("4.array  : "+array);
		System.out.println();
		
		//자료삭제(remove)
		array.remove(1);
		array.remove(3);
		array.remove(5);
		System.out.println("5.array크기  : "+array.size());
		System.out.println("5.array  : "+array);
		System.out.println();
		
		//자료삽입(add(인데스번호,요소)):인덱스번호 안 적으면 무조건 뒤로
		array.add(1, "그린");
		System.out.println("6.array크기  : "+array.size());
		System.out.println("6.array  : "+array);
		System.out.println();
		
		//향상된 for문을 이용한 자료의 출력 ()
		//객체대신 배열이음을 넣어도 됨 스트링형식의 문자를 name에 넣음
		for(String name : array) {
			System.out.print(name+ "/");
		}
		System.out.println("\n");
		
		//모든 자료 삭제
		array.clear();
		System.out.println("7.array크기  : "+array.size());
		System.out.println("7.array  : "+array);
		System.out.println();
	}
}
