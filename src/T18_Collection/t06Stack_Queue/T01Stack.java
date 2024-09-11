package T18_Collection.t06Stack_Queue;

import java.util.Stack;

/*
 LIFO(Last in First Out) - 후입선출
 */
//스택 자료구조 기준 : push() pop()
public class T01Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("1.크기 "+stack.size());
		System.out.println("1.내용 "+stack);
		System.out.println();
		
		//삽입 (push)
		stack.push(2);
		stack.push(4);
		stack.push(5);
		stack.push(9);
		stack.push(6);
		System.out.println("2.크기 "+stack.size());
		System.out.println("2.내용 "+stack);
		System.out.println();
		
		//검색 : search() // 마지막을 1번으로 봄
		System.out.println("3.검색(9)의 위치 "+stack.search(9));// 9는 끝에서 2번쨰
		System.out.println();
		
		//바로 아래 자료 쳐다보기 : peek()
		System.out.println("4.바로 꺼낼수 있는 자료 "+stack.peek());
		System.out.println();
		
		
		//꺼내기(pop)=지우기//마지막에 들어온게 나감. 중간것 지울 수 없음
		stack.pop();
		System.out.println("!.크기 "+stack.size());
		System.out.println("!.내용 "+stack); //[2, 4, 2, 9, 6]->[2, 4, 2, 9]
		System.out.println();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("!.크기 "+stack.size());
		System.out.println("!.내용 "+stack); //[2, 4, 2, 9, 6]->[2, 4, 2, 9]
		System.out.println();
	}
}
