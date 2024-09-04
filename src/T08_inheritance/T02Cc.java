package T08_inheritance;

//출력전담 클래스
public class T02Cc extends T2Bb {
	int squ, rou;
	
	//매개변수(flag)에 1이 오면 사각형 처리 2가 오면 원을 처리해서 출력한다.
	void prn(int flag){
		if(flag==1) {
			T02Aa squ =new T02Aa();
			System.out.println("사각형 면적은 :"+res1);
			System.out.println("사각형 둘레 :"+res1);
		}
		else if(flag==2) {
			//원에 관련된 출력
		}
	}
}
