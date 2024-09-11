package T18_Collection.t01Vetor;

import java.util.List;
import java.util.Vector;
//인덱스개념
//사용된 키워드 전부 필수 사용. 암기필요
//리스트는 무조건 인덱스를 사용
/*
 Vector : List계열, List자료구조의 특징을 모두 갖는다.
 인덱스로 관리, 순차처리, 앞에서부터 자료를 기억, 자료의 삽입/삭제시 많은 시간 고요될 수 있음. 중복허용됨
  '멀티스레드'의 동기화(Synchronized)작업에 유리, ArrayList에 비래서 안정적임.
 */
public class Test1 {
	public static void main(String[] args) {
//		Vector vector = new Vector();
//		Vector<String//제너릭 하위타입을 지정
		Vector<String> vector = new Vector<>();
//		List<String> vector = new Vector<>();//부모타입List가능
		
		System.out.println("1.vestor용량  : "+vector.capacity());//capacity용량 !=크기
		System.out.println("1.vestor크기  : "+vector.size());//.size배열의 크기(=배열의 길이)
		System.out.println("1.vestor문자  : "+vector.toString());//문자화
		System.out.println("1.vestor  : "+vector);//생략가능
		System.out.println();
		
		//자료삽입
		//공식:vector.add : 배열에 순차적으로 넣어줌
		vector.add("홍길동");
		vector.add("김말숙");
		vector.add("이기자");
		vector.add("오하늘");
		vector.add("고인돌");
		vector.add("소나무");
		System.out.println("2.vestor용량  : "+vector.capacity());
		System.out.println("2.vestor크기  : "+vector.size());
		System.out.println("2.vestor  : "+vector);
		System.out.println();
		
		vector.add("홍길동3");
		vector.add("김말숙3");
		vector.add("이기자3");
		vector.add("오하늘3");
		vector.add("고인돌3");
		vector.add("소나무3");
		System.out.println("3.vestor용량  : "+vector.capacity());
		System.out.println("3.vestor크기  : "+vector.size());
		System.out.println("3.vestor  : "+vector);
		System.out.println();
		
		//자료검색(get)
		System.out.println("4.vector.get(1) : "+vector.get(1));
		System.out.println("4.vector.get(5) : "+vector.get(5));
		System.out.println("4.vector.get(마지막인덱스) : "+vector.get(vector.size()-1));
		System.out.println();
		
		//자료수정(set)
		vector.set(1, "강감찬");
		System.out.println("4.vestor용량  : "+vector.capacity());
		System.out.println("4.vestor크기  : "+vector.size());
		System.out.println("4.vestor  : "+vector);
		System.out.println();
		
		//자료삭제(remove)
		vector.remove(1);
		vector.remove(3);
		vector.remove(5);
		System.out.println("5.vestor용량  : "+vector.capacity());
		System.out.println("5.vestor크기  : "+vector.size());
		System.out.println("5.vestor  : "+vector);
		System.out.println();
		//지워진 자리에 새로운 빈칸을 앞으로 당긴다음에 다음게 처리됨
		
		//자료삽입(add(인데스번호,요소)):인덱스번호 안 적으면 무조건 뒤로
		vector.add(1, "그린");
		System.out.println("6.vestor용량  : "+vector.capacity());
		System.out.println("6.vestor크기  : "+vector.size());
		System.out.println("6.vestor  : "+vector);
		System.out.println();
		
		//모든 자료 삭제
		vector.clear();
		System.out.println("7.vestor용량  : "+vector.capacity());
		System.out.println("7.vestor크기  : "+vector.size());
		System.out.println("7.vestor  : "+vector);
		System.out.println();
	}
}
