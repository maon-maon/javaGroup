package T18_Collection.T11_Ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*vo : 정의해놓은 자료 집합
 *vos:vo를 묶어 놓은것
 * */
public class T01_ListSpeedCheck {
	public static void main(String[] args) {
//		Vector<String> vos1 = new Vector<>();
//		ArrayList<String> vos2 = new ArrayList<>();
//		LinkedList<String> vos3 = new LinkedList<>();
		
		List<String> vos1 = new Vector<>();
		List<String> vos2 = new ArrayList<>();
		List<String> vos3 = new LinkedList<>();
		
//		int su = 100000;
		int su = 10000;
		long startTime, endTime;
		
		System.out.println("0번 인덱스에 자료추가하기 ");
		
		//Vector
		startTime = System.nanoTime();
		for(int i=0; i<su;i++) vos1.add(0,"홍길동"+i);//무조건 0번인덱스에 삽입
		endTime = System.nanoTime();
		System.out.println("Vector의 수행시간\t\t\t\t\t\t"+(endTime-startTime)+"ns");
		System.out.println();
		
		//ArrayList
		startTime = System.nanoTime();
		for(int i=0; i<su;i++) vos2.add(0,"김말숙"+i);//무조건 0번인덱스에 삽입
		endTime = System.nanoTime();
		System.out.println("ArrayList의 수행시간\t\t\t\t\t"+(endTime-startTime)+"ns");
		System.out.println();
		
		//LinkedList
		startTime = System.nanoTime();
		for(int i=0; i<su;i++) vos3.add(0,"이기자"+i);//무조건 0번인덱스에 삽입
		endTime = System.nanoTime();
		System.out.println("LinkedList의 수행시간\t\t\t\t\t "+(endTime-startTime)+"ns");
		System.out.println();
		
		
		
		
	}
}
