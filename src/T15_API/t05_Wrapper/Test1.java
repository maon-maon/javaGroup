package T15_API.t05_Wrapper;

public class Test1 {
	public static void main(String[] args) {
		int su1=100, su2=200;
		System.out.println("1.su1+100 "+(su1+100));
		
		//정수형 Boxing처리() -기본타입(int)이 참조타입(객체)로 변환
		Integer objsu1 = new Integer(su1);
		System.out.println("2.objsu1+100 "+ (objsu1+100));
		
		//자동박싱
		Integer objsu2 ;
		objsu2 = su1;//자동박싱이되서 문제 안 생김
		System.out.println("3.objsu1+100 "+ (objsu2+100));
		
		//언박싱// UnBoxing처리
		String strIntsu1 ="100";//정수형문자
		System.out.println("4.strIntsu1+100 "+(strIntsu1+100));
		System.out.println("5.strIntsu1+100 "+(Integer.parseInt(strIntsu1)+100));
		
		
		//double<-->Double
		double dbsu =3.14;
//		Double objdbsu = dbsu //(o) 얕은복사
		Double objdbsu = new Double(dbsu);//깊은복사//숫자형태의 객체를 생성함
		System.out.println("6.objdbsu+10.5 :" +(objdbsu+100.5));
		
		
		//박싱 Boxing
		int su3 =100;
//		Integer objsu=su3;//자동변환 (o)
		Integer objsu3 = Integer.valueOf(su3);//기본타입 숫자를 새로운 객체로 
		
		//언박싱 Unboxing
		int su4 = Integer.valueOf(objsu3);//객체로 바뀐건 valueof
		System.out.println("7.su4+100 "+su4+100);
		
		
	}
}
