package T16_Thread.MultiThread1;
//3.  1.Runnable : 객체생성
//Runnable, 스레드 상속이랑 방법이 같음
public class T02Run {
	public static void main(String[] args) {
		System.out.println("현재 클래스명 : T02_Run");
		System.out.println("현재 스레드명 : "+Thread.currentThread().getName());
		System.out.println();
		
		Runnable t2 = new T02();
		Thread thread = new Thread(t2);
		thread.start();
		
		try { Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println("===================================");
		System.out.println("현재 클래스명 : T02_Run");
		System.out.println("현재 스레드명 : "+Thread.currentThread().getName());
		System.out.println("===================================");
	}
}


class T02  implements Runnable{
	@Override
	public void run() {
		System.out.println("1.현재 클래스명 : T02 ");
		System.out.println("1.현재 실행중인 스레드명 : "+Thread.currentThread().getName());
		
//		for(long i=0; i<10000000000L;i++) {}
		for(int i=0; i<=5;i++) {
			System.out.println("i = " +i);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
		
		System.out.println("2.현재 클래스명 : T02 ");
		System.out.println("2.현재 실행중인 스레드명 : "+Thread.currentThread().getName());
		System.out.println("2. "+ Thread.currentThread().getName()+" 스레드가 종료됩니다.");
	}
}
