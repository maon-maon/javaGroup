package T16_Thread.t_sync;

//공유객체
class MyData2 {
	int data = 10;
	
	//스레드 메소드 동기화(synchronized)
	public synchronized void plusMethod() {
		int mydata = data;
		try { Thread.sleep(1000);} catch (InterruptedException e) {}
		data = mydata+1;
	}
}
/*스레드 메소드동기화 외
 공통작업 부분을 메소드안에 싱크로나이즈하면  블럭개념으로 들어간 한 블럭을 공통으로 써서 같이 영향을 주고싶음=다른거 실행중에 실행 안되게
 싱크로(객체명(this)){
 --내용 ----
 }
 이 부분 블럭 처리시 다른애가 개이 못하게함 그럼 이 블럭은 다른메소드가 침입 못함 이 블럭 끝낼때까지 안 대기함 
 메소드 동기화를 많이 씀
 */

//공유객체를 사용하는 스레드
class useMyData2 extends Thread{
	MyData2 my2;
	
	public useMyData2(MyData2 my2) {
		this.my2 = my2;
	}
	
	@Override
	public void run() {
		my2.plusMethod();
		System.out.println(getName()+"실행결과 : "+my2.data);
	}
}

public  class Test2 {
	public static void main(String[] args) {
		MyData2 myData = new MyData2();
		
		Thread th1 = new useMyData2(myData);
		th1.start();
		
		Thread th2 = new useMyData2(myData);
		th2.start();
		
		Thread th3 = new useMyData2(myData);
		th3.start();
	}
}
