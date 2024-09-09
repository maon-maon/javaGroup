package T15_API.t02_System;
//강제종료
public class Test3_exit강제종료 {
	public static void main(String[] args) {
		int i, tot =0;
		
		for(i=0;i<=1000000;i++) {
			tot +=i;
			if(tot>10000) {
				System.out.println("합이 10000이상일 떄의 i값은? "+i);
//				break;
//				return;//하단 출력부 안 나옴 바로 끝
				System.exit(0);//메인 실행을 강제종료 함. 0=아무것도 안 하고 종료
			}
		}
		System.out.println("tot : "+tot);
	}
}
