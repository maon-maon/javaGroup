package T18_Collection.t06Stack_Queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/*
 Queue : FIFO(First in First Out) - 선입선출
 */
/*예외처리 포함*///세트구성 : offer() peek() poll()
//인터페이스는 자기 혼자 사용 못함=익명 이너클래스 생성되버림 => 구현객체를 생성해서 사용=LinkdList사용
public class T02Queue2 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		//구현클래스 꺼내놓고 사용해야함 큐=링크리스트
		
		System.out.println("1.크기 "+queue.size());
		System.out.println("1.내용 "+queue);
		System.out.println();
	
		//자료 삽입 : offer() //
		queue.offer(30);
		queue.offer(33);
		queue.offer(23);
		queue.offer(16);
		queue.offer(26);
		System.out.println("2.크기 "+queue.size());
		System.out.println("2.내용 "+queue);
		System.out.println();//출구<[30, 33, 23, 16, 26]<입구
		
		//바로아래자료 쳐다보기 :peek
//		System.out.println("3.바로아래자료 "+queue.element());//offer에선 이걸로하면 오류남
		System.out.println("3.바로 꺼낼수 있는 자료 "+queue.peek());
		System.out.println();
		
		//꺼내기(=지우기) : poll
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		System.out.println(".크기 "+queue.size());
		System.out.println(".내용 "+queue);
		
		queue.poll();//자동 예외처리 됨. 오류를 발생시켜도 에러 안 뜸
	}
}
