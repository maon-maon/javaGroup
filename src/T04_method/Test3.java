package T04_method;

public class Test3 {
	int su;
	
	void mod1(int su) {
		this.su = su;//su값을 run에서 받아 필드에 보내줌
	}
	
	void mod2() {
		System.out.println("su * su = "+(su*su));
	}
}
