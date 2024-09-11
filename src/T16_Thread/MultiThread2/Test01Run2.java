package T16_Thread.MultiThread2;

public class Test01Run2 {
	public static void main(String[] args) {
		System.out.println("현재 클래스명 : Test01Run2");
		System.out.println("현재 스레드명 : "+Thread.currentThread().getName());
		System.out.println();
		
		//3개의 스레드 생성
		Test01 th = new Test01();
		
		//앞에 생성된 (스레드 Test01)클래스에 탑재시키면서 스레드 이름을 부여하여 새로운 스레드를 생성시킴
		Thread th1 = new Thread(th,"mbc");
		Thread th2 = new Thread(th,"kbs");
		Thread th3 = new Thread(th,"sbs");
		//생성한것 안에 이름을 넣어줌
		
		th1.start();
		th2.start();
		th3.start();
		
		try { Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println("===================================");
		System.out.println("현재 클래스명 : Test01Run2");
		System.out.println("현재 스레드명 : "+Thread.currentThread().getName());
		System.out.println("===================================");
	}
}
