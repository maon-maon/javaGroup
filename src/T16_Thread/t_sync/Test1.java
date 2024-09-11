package T16_Thread.t_sync;

//공유객체
class MyData {
	int data = 10;
	
	public void plusMethod() {
		int mydata = data;
		try { Thread.sleep(1000);} catch (InterruptedException e) {}
		data = mydata+1;
	}
}

//공유객체를 사용하는 스레드
class useMyData extends Thread{
	MyData my = new MyData();
	
	@Override
	public void run() {
		my.plusMethod();
		System.out.println(getName()+"실행결과 : "+my.data);
	}
}

public  class Test1 {
	public static void main(String[] args) {
		Thread th1 = new useMyData();
		th1.start();
		
		Thread th2 = new useMyData();
		th2.start();
		
		Thread th3 = new useMyData();
		th3.start();
	}
}
