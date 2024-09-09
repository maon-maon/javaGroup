package T15_API.t02_System;
//처리속도(처리시간)확인:cpu성능 확인 가능
public class Test4 {
	public static void main(String[] args) {
		int i, tot =0;
		
//		long startTime = System.currentTimeMillis();//천분의 일로는 속도 파알 불가능
		long startTime = System.nanoTime();//나노정도 되어야 시간 파악 가능
		
		for(i=0;i<=1000000;i++) {
			tot +=i;
		}
		
//		long endTime = System.currentTimeMillis();
		long endTime = System.nanoTime();
		
		System.out.println("작업에 소모된 시간 "+(endTime - startTime));
	}
}
