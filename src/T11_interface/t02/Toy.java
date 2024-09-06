package T11_interface.t02;
/*
 소비자가 장난감을 구매하려고 한다.
 각 장난감별 사용 연령대가 있다.
 =========================================
  종류   사용연령			팔/다리	 레이저발사		미사일
 ----------------------------------------- 
 곰돌이		제한없음				O				X				X
 로보트		 8세미만			O				O				X
 탱 크		13세미만			X				O				O
 비행기		16세미만			X				X				O
 =========================================
 숙제: 연령별 사용 사능한 장난감을 표시하시오
 */
public interface Toy {
	void age();
	void product(String name);
	void moving();
	void fire();
	void misaile();
	
	int possibleAge();
}
