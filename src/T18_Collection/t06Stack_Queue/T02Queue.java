package T18_Collection.t06Stack_Queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/*
 Queue : FIFO(First in First Out) - 선입선출
 */
/*예외처리 미포함*/ //세트구성 : add() element() remove()
//인터페이스는 자기 혼자 사용 못함=익명 이너클래스 생성되버림 => 구현객체를 생성해서 사용=LinkdList사용
public class T02Queue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		//구현클래스 꺼내놓고 사용해야함 큐=링크리스트
		
		System.out.println("1.크기 "+queue.size());
		System.out.println("1.내용 "+queue);
		System.out.println();
		
		//자료 삽입 :add
		queue.add(30);
		queue.add(33);
		queue.add(23);
		queue.add(16);
		queue.add(26);
		System.out.println("2.크기 "+queue.size());
		System.out.println("2.내용 "+queue);
		System.out.println();//출구<[30, 33, 23, 16, 26]<입구
		
		//바로아래자료 쳐다보기 :element
		System.out.println("3.바로 꺼낼수 있는 자료 "+queue.element());
		System.out.println();
		
		//꺼내기(=지우기) : remove
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		System.out.println(".크기 "+queue.size());
		System.out.println(".내용 "+queue);
		
//		System.out.println("3.바로아래자료 "+queue.element());//예외처리 반응 못 함 에러발생
		System.out.println("3.바로아래자료 "+queue.peek());//예외처리가 되어있음 여기선peek사용하면 안 됨
//		queue.remove();
	}
}
