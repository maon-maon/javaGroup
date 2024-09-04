package T03_Constructor생성자;
//공장+부품=생산라인
public class Test4_2 {		
	String model;
	String color="블랙";
	int speed;
	
	public Test4_2(String model) {		//#1
//		this.model=model;
//		this.color="흰색";
//		this.speed=250;
		this( model, "흰색",  250);//호출할땐 타입명 필요없음//여기서 불러온건 #3의 값을 불러옴 this()는필드를 호출함
	}
	
	public Test4_2(String model,String color) {		//#2
//		this.model=model;
//		this.color=color;
//		this.speed=250;
		this( model, color, 250);
	}
	
	
	public Test4_2(String model,String color, int speed) {		//#3//이걸 활용해서this()로 묶어버림
		this.model=model;
		this.color=color;
		this.speed=speed;
	}
}
