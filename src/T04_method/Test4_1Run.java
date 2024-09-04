package T04_method;

import java.util.Scanner;
//충전하려는 가스를 입력받아
public class Test4_1Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		int gas;//메인메소드 안에 들어있는 변수임 필드아님
		
		Test4 t4 = new Test4();
		
		if(t4.gas == 0) {
			while(true) {//반복 횟수 지정이 아님=while문으로 반복
				System.out.print("가스를 주입하세요");
				gas=sc.nextInt();
				if(gas<0) {
					continue;//바로위 와일문으로 돌아감
				}
				else {
					t4.gas=gas;
					t4.run();
					break;//여기서 반복이 끝나야함
				}
			}
		}	
		else {
				t4.run();
			
		}
		System.out.println("작업끝");
		sc.close();
	}
}
