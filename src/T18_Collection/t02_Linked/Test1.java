package T18_Collection.t02_Linked;

import java.util.LinkedList;
import java.util.List;
//주소개념
/*
 LinkedList : List계열, List자료구조의 특징을 갖는다.
 인덱스가 없다. 따라서 순차처리 개념이 없다. 많은 자료의 순차검색시는 많은 시간이 걸린다.
 단, 자료의 삽입/삭제는 처리속도가 빠르다. 따라서 자료의 삽입/삭제가 빈번한 자료구조에서 적합하다.
 '이중 LinkedList(앞주소-데이터-뒤주소)'의 자료구조로 설계되어있기에, 복구작업이 가능하다.
 */
public class Test1 {
	public static void main(String[] args) {
//		LinkedList<String> linked = new LinkedList<String>();
		LinkedList<String> linked = new LinkedList<>();
//		List<String> linked = new LinkedList<>();

		
//		System.out.println("1.linked용량  : "+linked.capacity());//용량개념없음=사용안함
		System.out.println("1.linked크기  : "+linked.size());//.size배열의 크기(=배열의 길이)
		System.out.println("1.linked문자  : "+linked.toString());//문자화
		System.out.println("1.linked  : "+linked);//생략가능
		System.out.println();
		
		//자료삽입
		linked.add("홍길동");
		linked.add("김말숙");
		linked.add("이기자");
		linked.add("오하늘");
		linked.add("고인돌");
		linked.add("소나무");
		System.out.println("2.linked크기  : "+linked.size());
		System.out.println("2.linked  : "+linked);
		System.out.println();
		
		linked.add("홍길동3");
		linked.add("김말숙3");
		linked.add("이기자3");
		linked.add("오하늘3");
		linked.add("고인돌3");
		linked.add("소나무3");
		System.out.println("3.linked크기  : "+linked.size());
		System.out.println("3.linked  : "+linked);
		System.out.println();
		
		//자료검색(get)
		System.out.println("4.linked.get(1) : "+linked.get(1));
		System.out.println("4.linked.get(5) : "+linked.get(5));
		System.out.println("4.linked.get(마지막위치) : "+linked.get(linked.size()-1));
		System.out.println();
		
		//자료수정(set)
		linked.set(1, "강감찬");
		System.out.println("4.linked크기  : "+linked.size());
		System.out.println("4.linked  : "+linked);
		System.out.println();
		
		//자료삭제(remove)
		linked.remove(1);
		linked.remove(3);
		linked.remove(5);
		System.out.println("5.linked크기  : "+linked.size());
		System.out.println("5.linked  : "+linked);
		System.out.println();
		
		//자료삽입(add(인데스번호,요소)):인덱스번호 안 적으면 무조건 뒤로
		linked.add(1, "그린");
		System.out.println("6.linked크기  : "+linked.size());
		System.out.println("6.linked  : "+linked);
		System.out.println();
		
		//모든 자료 삭제
		linked.clear();
		System.out.println("7.linked크기  : "+linked.size());
		System.out.println("7.linked  : "+linked);
		System.out.println();
	}
}
