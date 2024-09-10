package T16_Thread.MultiThread3;
//상속받아 사용
public class T01Run {
	public static void main(String[] args) {
		//자막객체 생성 실행
		Thread smiThread = new smiFile();
		smiThread.start();
		
		//영상객체 생성 실행
		Thread screenThread = new ScreanFile();
		screenThread.start();
		
		
	}
}


//영상을 처리하는 클래스
class ScreanFile extends Thread{
	@Override
	public void run() {
		//#1.영상 프레임 1~5컷
		int [] screenArray = {1,2,3,4,5};
		
	//#3 영상 출력
		for(int i=0; i<screenArray.length;i++) {
			System.out.print("영상프레임 : "+screenArray[i]);
			try {Thread.sleep(500);	} catch (InterruptedException e) {}//지워도 에러 안남 에러 난게 뭔지 모를뿐
		}
	}
}	
	
//자막을 처리하는 클래스
class smiFile extends Thread{
	@Override
	public void run() {
	//#2. 각 프레임에 표시될 자막
		String[] smiArray = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(10);	} catch (InterruptedException e) {}
		
		for(int i=0; i<smiArray.length;i++) {
			System.out.println(" - 자막출력 : "+smiArray[i]);
			try {Thread.sleep(500);	} catch (InterruptedException e) {}
		}
	}
}