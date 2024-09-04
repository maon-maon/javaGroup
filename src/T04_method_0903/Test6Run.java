package T04_method_0903;

import java.util.Scanner;

public class Test6Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test6	t6 = new Test6();
		
		t6.mod1();
		System.out.println();
		
		System.out.print("정수 입력하세요");
		int su = sc.nextInt();
		
		//입력된 정수가 음수/양수 판별
		String check = t6.integerCheck(su);//위에스 스탠받은 su를 사용할거임 리턴된걸 앞의 체크가 받을거임///매개변수에su를 넣어서 t6에 있는integerCheck를 사용할거임 리턴으 스트링으로 받을거임
		System.out.println("입력된 수 "+su+"는 "+check+"입니다.");
		
		sc.close();
	}
}