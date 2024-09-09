package T15_API.t01_Object;

import java.util.Objects;
//오브젝트객체
public class Test3 {
	public static void main(String[] args) {
		Test2VO vo =new		Test2VO();
		System.out.println(vo);
		//값을 주지 않은 상태 :Test2VO [name=null, age=0, gender=false, job=null, address=null]

		if(vo == null)System.out.println("1.vo는 null입니다."); 
		else System.out.println("1.vo는 null이 아닙니다."); 
		System.out.println();
		//vo안의 name이 널이지 vo는 널이 아님
		
		if(vo.getName()==null)System.out.println ("2.vo.name는 null입니다."); //스트링은 null과 비교
		else System.out.println("2.vo.name는 null이 아닙니다."); 
		System.out.println();
		
		if(Objects.isNull(vo))System.out.println("3.vo는 null입니다."); 
		else System.out.println("3.vo는 null이 아닙니다."); 
		System.out.println();
		
		if(Objects.nonNull(vo))System.out.println("4.vo는 null 아닙니다."); 
		else System.out.println("4.vo는 null입니다."); 
		System.out.println();
		
		if(vo.getAge()==0)System.out.println ("5.vo.age는 0입니다."); //정수는 정수랑 비교
		else System.out.println("5.vo.age는 0이 아닙니다."); 
		System.out.println();
		
		vo.setName("홍");//가장 많이 사용하는 방법
		if(vo.getName()!=null) {//널값으로 바로 비교할 수 있음
//		if(Objects.nonNull(vo.getName())) {
			System.out.println("6.vo.name : "+vo.getName());//널이 아니면 출력
		}
		else {//널이 아닌게 거짓이면 출력
			System.out.println("성명을 입력");
		}
		System.out.println();
		System.out.println();
		
		vo.setName(null);
		System.out.println("7.name "+vo.getName());
		
		vo.setName("김");
		System.out.println("8.name "+Objects.requireNonNull(vo.getName()));//예외처리를 하는경우
		System.out.println();
	}
}
