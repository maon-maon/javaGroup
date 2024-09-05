package T10_abstract.Bunsik;

import java.util.Scanner;

public class Run_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		WangjaBunsik_	wangja =new WangjaBunsik_(4500, 5000, 6000, 0, 1000);
		SeoulBunsik_ seoul = new SeoulBunsik_(5000,5000,5000,4000,0);
		WoojuBunsik_ wooju = new WoojuBunsik_(6000,7000,7000,6000,1000);
		
		
		wangja.getKimchi();
		wangja.getBudea();
		wangja.getBibim();
		wangja.getSundea();
		wangja.getBab();
		
		
		

		
		sc.close();
	}
}
