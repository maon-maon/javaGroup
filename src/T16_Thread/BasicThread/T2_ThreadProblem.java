package T16_Thread.BasicThread;
//스레드 문제점 : 문제점이라고 생각하는것 싱글스레드=영상따로 자막따로 나옴 한 화면에 출력 아님
public class T2_ThreadProblem {
	public static void main(String[] args) {
		//#1.영상 프레임 1~5컷
		int [] screenArray = {1,2,3,4,5};
		
		//#2. 각 프레임에 표시될 자막
		String[] smiArray = {"하나","둘","셋","넷","다섯"};
		
		//#3 영상 출력
		for(int i=0; i<screenArray.length;i++) {
			System.out.println("영상프레임 : "+screenArray[i]);
//			Thread.sleep(1000);//1초동안 스레드를 재워=멈춰달라
			try {Thread.sleep(500);	} catch (InterruptedException e) {}//지워도 에러 안남 에러 난게 뭔지 모를뿐
		}
		
		//#4 자막출력
		for(int i=0; i<smiArray.length;i++) {
			System.out.println("자막출력 : "+smiArray[i]);
			try {Thread.sleep(500);	} catch (InterruptedException e) {}
		}
		
		System.out.println("The End---");
	}
}
