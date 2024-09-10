package T16_Thread.BasicThread;

//2.Runable 인터페이스 구현 방식
public class T4_Interface {
	public static void main(String[] args) {
		System.out.println("현재 실행중인 스레드명 : "+Thread.currentThread().getName());
//		MyThread2 mt2 = new MyThread2();
		Runnable mt2 = new MyThread2();			//3.Runnable 구현객체를 생성(
		Thread th1 = new Thread(mt2);			  //4.Thread객체를 생성하면서 Runaable객체 변수를 매개값으로 대입.
	  //생성한 객체를 스레드에 넣어서 바로 사용함
		th1.start();											  //5. start()메소드를 실행
		
	}
}
//MyThread2라는 일반클래스임
//임플리먼트는 부모타입이 아니라 Runnable라고 적어야 함 
class MyThread2 implements Runnable{	//1.Runnable 인터페이스를 구현하는 클래스를 정의
	@Override
	public void run() {						//2.Run()메소드를 오버라이드하여 수행할 스레드 코드를 작성
		System.out.println("스레드명 : "+Thread.currentThread().getName());
		}
	
}
/*1.구현객체 만듦
 * 2.만든 스레드에 객체를 넣어서 사용
*/
