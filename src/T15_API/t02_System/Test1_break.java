package T15_API.t02_System;

public class Test1_break {
	public static void main(String[] args) {
		int i, tot =0;
		
		for(i=0;i<=1000000;i++) {
			tot +=i;
			if(tot>10000) {
				System.out.println("합이 10000이상일 떄의 i값은? "+i);
				break;
			}
		}
		System.out.println("tot : "+tot);
	}
}
