package T08_inheritance;

public class T05_C extends T05_P {

	@Override
	void areaC(int r) {
		
	}

	@Override
	void div(int su1, int su2) {
//		super.div(su1, su2);//자식메소드 사용하지 않고 부모 메소드 호출
		double res= (double)su1/su2;
		System.out.println("res : "+res);
	}
	
	
}
//1.단순복사
//2.어노테이션으로 
//3.메소드 이름으로 자동완성