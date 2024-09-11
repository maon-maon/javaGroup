package T18_Collection.t04Set;

import java.util.TreeSet;

/*
  TreeSet: Set계열, 집합자료구조, Hash의 역할과 같은데, 차이점은 꺼낼때 자료가 자동으로 오름차순으로 정렬되어 있다.
  */
public class T02TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(5);
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(8);
		treeSet.add(15);
		
		System.out.println("1.크기 : "+treeSet.size());
		System.out.println("1.내용 : "+treeSet);
		System.out.println();
		
//	키워드 TreeSet에서만 사용 됨. Set에선 사용 불가
		System.out.println("2.first() : "+treeSet.first());
		System.out.println("3.last() : "+treeSet.last());
		System.out.println("4.lower() : "+treeSet.lower(11));//보다 작은 근접한 수
		System.out.println("5.higher() : "+treeSet.higher(11));//보다 큰 근접한 수
		System.out.println("6.higher() : "+treeSet.higher(10));
	}
}
