package T10_abstract.Bunsik;

import java.util.Scanner;

public class Run_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Bonsa_[] bonsa = {new WangjaBunsik_(),new SeoulBunsik_(),new WoojuBunsik_()};
		int choice = 0;
		
		while(true) {
			System.out.println("선택");
			System.out.println("1.왕자분식 2.서울분식 3. 우주분식 0.종료");
			choice = sc.nextInt();
			if(choice<1 || choice>3) break;
			
			switch (choice) {
				case 1:
					Bonsa_ wangja =new WangjaBunsik_();
					wangja.kimchi();//이경우는 겟으로 안씀. 메소드를 호출해서 씀
					wangja.budea();
					wangja.bibim();
					wangja.sundea();
					wangja.bab();
					break;
				case 2:
					Bonsa_ seoul = new SeoulBunsik_();
					seoul.kimchi();
					seoul.budea();
					seoul.bibim();
					seoul.sundea();
					seoul.bab();
					break;
				case 3:
					Bonsa_ wooju = new WoojuBunsik_();
					wooju.kimchi();
					wooju.budea();
					wooju.bibim();
					wooju.sundea();
					wooju.bab();
					break;
			}
		}
		sc.close();
	}
}
