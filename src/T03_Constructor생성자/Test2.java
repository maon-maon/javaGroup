package T03_Constructor생성자;

public class Test2 {
// 기본생성자
	Test2() {}//아무것도없으면 컴파일러가 알아서만듬.무조건x 생성자가 없을때만 만듬. 사용자가 1개이상 생성자 만들면 커파일러가 안 만듬
	
	Test2(int su1) {}
	
	Test2(int su1,int su2) {}//갯수가 차이나면 에러 발생x
	
	Test2(int su1, double su2) {}//타입유형이 다르면 에러발생x
	
	Test2(double su1, int su2) {}//순서가 다르면 오류x
	
	
}
