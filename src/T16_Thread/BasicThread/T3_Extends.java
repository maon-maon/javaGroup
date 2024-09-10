package T16_Thread.BasicThread;
//1. Thread 클래스를 상속받아서 클래스를 정의
public class T3_Extends {
	public static void main(String[] args) {
		System.out.println("현재 실행중인 스레드명 : "+Thread.currentThread().getName());
		MyThread1 mt1 = new MyThread1();		//3.스레드 객체 생성
//		mt1.run();//이렇게 사용하면 안 됨
		mt1.start();//시작과 끝을 모두 관리해줌 //4.스레드 실행(run메소드가 아닌 strat()메소드를 이용한 스레드 호출)
	}
}
//상속 밭는 부모타입 이름이 아니라 스레드라고 적음
class MyThread1 extends Thread{		//1.Thread클래스를 상속한 클래스를 정의  //스레드가 아니라 메소드로 처리 됨
	@Override//부모가 인터페이스, 추상이 아니라도 오버라이드 함= 스레드 사용을 위해 약속된 메소드
	public void run() {			//2.Run()메소드를 오버라이드하여 스레드 처리에 필요한 코드를 작성
		System.out.println("스레드명 : "+this.getName());//실행되는 스레드의 이름은 자동적으로 JVM이 Thread-0,1,2...붙여준다.
	}
}
