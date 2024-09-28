package T16_Thread.MultiThread3.Re;

public class T02 {
	public static void main(String[] args) {
		Runnable scrTh = new screen();
		Thread scrTh1	= new Thread(scrTh);
		scrTh1.start();
		
		Runnable smiTh = new smiFile2();
		Thread smiTh1	= new Thread(smiTh);
		smiTh1.start();
	}
}

class ScreanFile2  implements Runnable{
	@Override
	public void run() {
		int [] screenArray = {1,2,3,4,5};
		
		for(int i=0; i<screenArray.length;i++) {
			System.out.print("영상프레임 : "+screenArray[i]);
			try {Thread.sleep(500);	} catch (InterruptedException e) {}//지워도 에러 안남 에러 난게 뭔지 모를뿐
		}
	}
}	
	
class smiFile2 implements Runnable  {
	@Override
	public void run() {
		String[] smiArray = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(10);	} catch (InterruptedException e) {}
		
		for(int i=0; i<smiArray.length;i++) {
			System.out.println(" - 자막출력 : "+smiArray[i]);
			try {Thread.sleep(500);	} catch (InterruptedException e) {}
		}
	}
}