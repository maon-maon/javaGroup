package T16_Thread.MultiThread3;

public class T04Run {
	public static void main(String[] args) {
		//자막을 출력하는 스레드를'익명이너클래스'로 구현한다.
		Thread smith1 = new Thread(new Runnable() {
			@Override
			public void run() {
			//#2. 각 프레임에 표시될 자막
				String[] smiArray = {"푸른","하늘","은하수","하얀","쪽배에"};
				try {Thread.sleep(10);	} catch (InterruptedException e) {}
				
				for(int i=0; i<smiArray.length;i++) {
					System.out.print(" - 자막출력 : "+smiArray[i]);
					try {Thread.sleep(500);	} catch (InterruptedException e) {}
				}
			}
		});
		
		//영상을 출력하는 스레드를 익명 이너클래스로 구현
		Thread screenTh1 = new Thread(new Runnable() {
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
		});
		
		//자막을 설명하는 사람이 누구인지 출력하는 스레드를 익명 이너클래스로 구현
		Thread actorTh1 = new Thread(new Runnable() {
			@Override
			public void run() {
				//#1.영상 프레임 1~5컷
				String [] strArray = {"홍길동","이기자","김말숙","컴퓨터","그린"};
				
				//#3 배우 출력
				try {Thread.sleep(30);	} catch (InterruptedException e) {}
				
				for(int i=0; i<strArray.length;i++) {
					System.out.println(" 나레이션 배우 : "+strArray[i]);
					try {Thread.sleep(500);	} catch (InterruptedException e) {}//지워도 에러 안남 에러 난게 뭔지 모를뿐
				}
			}
		});
		
		//앞에서 생싱시켜놓은 익명 이너 클래스를 실행한다.
		smith1.start();
		screenTh1.start();
		actorTh1.start();
	}
}

