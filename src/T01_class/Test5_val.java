package T01_class;

public class Test5_val {
	public static void main(String[] args) {
		int su1=100, su2=0, su3;//su3초기값 안 줌
		
		for(int i=0; i<5;i++) {
//			int su2 = 200*i;//초기값줌
			System.out.println(su1+su2);
		}
		
		su3=su1+su2;
		
		System.out.println(su3+200);
		System.out.println("su3 :"+su3+200);//문자열로 변경되어 단순 붙이기 연산이 됨
	}
}
//동일 변수는 같은 내용안에 넣을 수 없음
//타입선언은 for문 안에 넣을경우 해당 문장안에서만 허용됨
