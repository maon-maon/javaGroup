package T16_Thread.MultiThread1;

public class T01_Run {
	public static void main(String[] args) {
		System.out.println("현재 클래스명 : T01_Run");
		System.out.println("현재 스레드명 : "+Thread.currentThread().getName());
		System.out.println();
		
		Thread th1 = new T01();
		th1.start();//스레드는 여러개 실행을 띄워도 한번밖에 수행 못함. 다른 객체를 받아서 수행시켜야 가능함
		
		try { Thread.sleep(2000);} catch (InterruptedException e) {}//중간에 작동해버리는 스레드
		System.out.println("===================================");
		System.out.println("현재 클래스명 : T01_Run");
		System.out.println("현재 스레드명 : "+Thread.currentThread().getName());
		System.out.println("===================================");
	}
}

class T01 extends Thread {
	@Override
	public void run() {
		System.out.println("1.현재 클래스명 : T01 ");
		System.out.println("1.현재 실행중인 스레드명 : "+Thread.currentThread().getName());
		
//		for(long i=0; i<10000000000L;i++) {}
		for(int i=0; i<=5;i++) {
			System.out.println("i = " +i);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
		
		
		
		System.out.println("2.현재 클래스명 : T01 ");
		System.out.println("2.현재 실행중인 스레드명 : "+Thread.currentThread().getName());
		System.out.println("2. "+ Thread.currentThread().getName()+" 스레드가 종료됩니다.");
	}
}