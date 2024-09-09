package t50_Exercise;

import java.util.Scanner;

/*
 	단어(문장)을 입력받은 후, 입력받은 글자 중에서 특정 문자가 어디/어디에 위치하고 있는지를 출력하시오.
 	예)Welcome to Korea!
 			찾고자하는 알파벳 : o
 			o를 포함하고 있는 개수 :3개
 			o가 위치한곳 : 4 / 9 /12
 */
public class T5_indexOf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		
		System.out.println("문장을 입력해 주세요");
		System.out.println("---------------------");
		System.out.println("1.I have a dream");
		System.out.println("2.Make a better place");
		System.out.println("3.Hand in hand  we stand");
		System.out.println("---------------------");
		num=sc.nextInt();
		
		if(num==1) {
			//             01234567890123
			String str1 = "I have a dream";
			System.out.println("a의 갯수는 : "+str1.indexOf("a"));

			System.out.println("a의 위치는 : "+str1.indexOf("a"));
			System.out.println("a의 위치는 : "+str1.indexOf("a",str1.indexOf("a")+1));
				
						
		}
			
		
		
		
		
//		String str = "Welcome to Korea!";
//		
//		System.out.println("찾고자하는 알파벳 : o 위치 = " +str.indexOf("o"));
//		System.out.println("o를 포함하고 있는 개수 : " +str.indexOf("o"));
//		System.out.println("찾고자하는 알파벳 : o 위치 = " +str.indexOf("o"));
		
		
		sc.close();
	}
}
