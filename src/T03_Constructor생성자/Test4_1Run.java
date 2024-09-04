package T03_Constructor생성자;

public class Test4_1Run {
	public static void main(String[] args) {
		Test4_1 t41= new Test4_1("그랜져");//매개변수를 받을 new생성됨 //#1
		System.out.println("모델명 : "+t41.model);
		System.out.println("색상명 : "+t41.color);
		System.out.println("최대속도 : "+t41.speed);
		System.out.println();
		
		Test4_1 t42 = new Test4_1("제네시스", "은색");		//#2
		System.out.println("모델명 : "+t42.model);
		System.out.println("색상명 : "+t42.color);
		System.out.println("최대속도 : "+t42.speed);
		System.out.println();
		
		Test4_1 t43 = new Test4_1("렉서스", "군청", 300);		//#3
		System.out.println("모델명 : "+t43.model);
		System.out.println("색상명 : "+t43.color);
		System.out.println("최대속도 : "+t43.speed);
		System.out.println();
	}
}
