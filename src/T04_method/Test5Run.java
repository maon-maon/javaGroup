package T04_method;
//볼륨업 볼륨다운 출력
import java.util.Scanner;

public class Test5Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String volume;
		
		Test5 t5 = new Test5(5);
		t5.volumePrint();
		
		while(true) {
			System.out.println("볼륨 크기를 조정(+/-,종료=0)");
			volume = sc.next();
			if(volume.equals("+")) t5.volumeUp();
			else if(volume.equals("-")) t5.volumeDw();
			else break;
		}
		sc.close();
	}
}