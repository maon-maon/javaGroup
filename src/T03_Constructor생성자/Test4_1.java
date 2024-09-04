package T03_Constructor생성자;

public class Test4_1 {
	String model;//필드선언=전역변수
	String color="블랙";
	int speed;
	
	public Test4_1(String model) {//매개변수
		this.model=model;//값을 받아 필드에전달
		this.color="흰색";
		this.speed=250;
	}
	
	public Test4_1(String model,String color) {//외부에서 넘겨주는값2개됨
		this.model=model;
		this.color=color;
		this.speed=250;
	}
	
	
	public Test4_1(String model,String color, int speed) {//외부에서 넘겨주는값3개됨
		this.model=model;
		this.color=color;
		this.speed=speed;
	}
}
