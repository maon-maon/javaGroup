package T18_Collection.t04Set;

import java.util.HashSet;
import java.util.Set;

/*
  Set계열 : 집합자료구조 - HashSet / TreeSet
  인덱스 정보가 없다. 비순서 자료구조, 중복을 허용하지 않음
 */
public class T01_HashSet {
	public static void main(String[] args) {
//		HashSet<String> hash = new HashSet<String>();
		HashSet<String> hash = new HashSet<>();
//		Set<String> hash = new HashSet<>();
		
		System.out.println("1.크기 : "+hash.size());
		System.out.println("1.내용 : "+hash);
		System.out.println();
		
		//자료의 추가(add)
		hash.add("홍길동");
		hash.add("김말숙");
		hash.add("이기자");
		hash.add("소나무");
		hash.add("강감찬");
		System.out.println("2.크기 : "+hash.size());
		System.out.println("2.내용 : "+hash);
		System.out.println();
		
		hash.add("홍길동");//중복허용 안 함
		System.out.println("3.크기 : "+hash.size());
		System.out.println("3.내용 : "+hash);
		System.out.println();
		
		hash.add(new String("홍길동"));//new 객체 생성해도 안 됨=중복 불가 : 덮어쓰기 기능
		System.out.println("4.크기 : "+hash.size());
		System.out.println("4.내용 : "+hash);
		System.out.println();
		
		//제거(remove)
//		hash.remove(1);//에러는 안남=수행은 함.
		hash.remove("홍길동");
		System.out.println("5.크기 : "+hash.size());
		System.out.println("5"
				+ ".내용 : "+hash);
		System.out.println();
		
		//추가(add)
		hash.add("오하늘");
		System.out.println("6.크기 : "+hash.size());
		System.out.println("6.내용 : "+hash);
		System.out.println();
		
		//찾고자하는 값의 포함유무? contains()
		System.out.println("7.'김'의 포함유무? " +hash.contains("김"));
		System.out.println("7.'김말숙'씨의 포함유무? " +hash.contains("김말숙"));
		System.out.println();
		
	//향상된 for문을 이용한 자료의 출력 ()
		for(String name : hash) {
			System.out.print(name+ "/");
		}
		System.out.println("\n");
		
		//람다식 표현(함수적표현)
		hash.forEach(name-> {
			System.out.println("값 : "+name);
		});
		System.out.println();
		
		//전체삭제 (clear)
		hash.clear();
		System.out.println("8.크기 : "+hash.size());
		System.out.println("8.내용 : "+hash);
		System.out.println();
		
		//비어있는지의 유무 isEmpty
		System.out.println("9.비어있음? " +hash.isEmpty());
		
	}
}
