package T10_abstract.t1111;

public class Run3 {
public static void main(String[] args) {
		
//		Phone samsungPhone= new Samsung("홍길동");
//		samsungPhone.powerOn();
//		samsungPhone.sound();
//		samsungPhone.function();
//		samsungPhone.functionSamsung();
//		samsungPhone.powerOn();
//		
//		Lg lgPhone = new Lg("김말숙");		
//		lgPhone.powerOn();
//		lgPhone.sound();
//		lgPhone.function();
//		lgPhone.functionSamsung();
//		lgPhone.powerOn();
		
		Phone[] phone = {new Samsung("홍길동"), new Lg("김말숙")};
		for(int i=0; i<phone.length;i++) {
			phone[i].powerOn();
			phone[i].sound();
			phone[i].function();
			phone[i].powerOff();
		}
	}
}
