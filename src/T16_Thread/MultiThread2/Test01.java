package T16_Thread.MultiThread2;

public class Test01 extends Thread {
	int cnt=10;
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			if(Thread.currentThread().getName().equals("mbc")) {
				cnt++;
				System.out.println(cnt + ".mbc스레드가 지나갑니다.");
			}//변수명 받아서 출력하기 위한 코드 1Run은 이름 변수가 없으니 if문 통과하지 않고 지나감 
			System.out.println(i+ ".스레드명 : "+Thread.currentThread().getName());
			try {Thread.sleep(500);	} catch (InterruptedException e) {}
			System.out.println();
		}
	}
}
