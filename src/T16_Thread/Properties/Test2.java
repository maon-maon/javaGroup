package T16_Thread.Properties;

//스레드 우선순위
public class Test2 {
	public static void main(String[] args) {
		//cpu Core수 가져오기(=윈도우프로서스=자바코어)
		System.out.println("코어수 : " +Runtime.getRuntime().availableProcessors());//활성화된 프로세서
		
		
		for(int i=0; i<3;i++) {
			System.out.println(i+".번째");
			Thread thread = new MyThread();
			thread.start();
		}
		System.out.println("======================");
		
		//스레드 우선순위 지정(변경) - 우선순위 숫자가 높을수록 우선순위가 더 '높다/빠르다'
		//최대순위 10
		for(int i=0; i<15;i++) {
			System.out.print(i+".번째 ");
			Thread thread = new MyThread();
			if(i==7) thread.setPriority(Thread.MAX_PRIORITY);
			thread.start();
		}System.out.println();
		
		System.out.println("\n현재 실행중인 스레드명 : "+Thread.currentThread().getName());
		//메인스레드는 항상 최우선 실행됨
	}
}
class MyThread extends Thread{
	@Override
	public void run() {
		try { Thread.sleep(400);} catch (Exception e) {}
		System.out.println(getName()+" 우선순위 : "+getPriority());//기본 우선순위는 모두 5이다.
		System.out.println();
	}
}