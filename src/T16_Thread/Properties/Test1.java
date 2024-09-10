package T16_Thread.Properties;
//스레드 개수
public class Test1 {
	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		System.out.println("1.현재 스레드 : "+thread.getName());
		System.out.println("1.현재 동작하는 스레드 개수 : "+Thread.activeCount()); //1개
		System.out.println();
		
		for(int i=0; i<3; i++) {
			Thread th = new Thread();
			th.start();
			System.out.println("2.스레드명 : " +th.getName());
		}
		System.out.println("2.현재 동작하는 스레드 개수 : "+ Thread.activeCount()); //2개이상(최대 4ro)
		System.out.println();
		
		for(int i=0; i<3; i++) {
			Thread th = new Thread();
			th.setName(i+"번째 스레드");
			System.out.println("3.스레드명 : " +th.getName());
		}
		System.out.println("3.현재 동작하는 스레드 개수 : "+ Thread.activeCount()); //2개이상(최대 4ro)
		System.out.println();
		
		//스레드 이름을 지정하지 않아도 JVM이 카운트 중임
		for(int i=0; i<3; i++) {
			Thread th = new Thread();
			th.start();
			System.out.println("4.스레드명 : " +th.getName());
		}
		System.out.println("4.현재 동작하는 스레드 개수 : "+ Thread.activeCount()); //2개이상(최대 4ro)
		System.out.println();
	}
}
