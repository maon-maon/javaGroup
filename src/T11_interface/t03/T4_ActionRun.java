package T11_interface.t03;

import java.util.Scanner;

/* 배역을 입력하면 해당배역의 역할을 출력하세요.
 */
public class T4_ActionRun{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int act;
		
		System.out.println("배역을 입력하세요");
		System.out.println("---------------------");
		System.out.println("1.경찰관, 2.소방관, 3.요리사");
		act = sc.nextInt();
		
//		if(act>0||act<4)
		
		
		
		sc.close();
	}
}
