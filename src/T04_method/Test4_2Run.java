package T04_method;

import java.util.Scanner;
//번잡도 해결
public class Test4_2Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		int gas;//메인메소드 안에 들어있는 변수임 필드아님
		
		Test4 t4 = new Test4();
		
		if(t4.gas == 0) {
			while(true) {
				System.out.print("가스를 주입하세요 ");
				gas=sc.nextInt();
				if(gas>0) {
					t4.gas=gas;
					t4.run();
					break;//가스가 0보다크면 돌아가라
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
