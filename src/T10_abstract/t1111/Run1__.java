package T10_abstract.t1111;

public class Run1__ {
	public static void main(String[] args) {
		
		Samsung samsungPhone= new Samsung("홍길동");
		samsungPhone.powerOn();
		samsungPhone.sound();
		samsungPhone.function();
		samsungPhone.functionSamsung();
		samsungPhone.powerOn();
		
		Lg lgPhone = new Lg("김말숙");		
		lgPhone.powerOn();
		lgPhone.sound();
		lgPhone.function();
		lgPhone.functionLg();
		lgPhone.powerOn();
	}
}
