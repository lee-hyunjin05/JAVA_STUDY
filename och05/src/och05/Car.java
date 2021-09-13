package och05;

//class -->> 설계도
public class Car {
	
	String color ;	// Member 변수 , 필드
	int speed;
	
	// Method (영문자 또는 $로 시작) 두번째 부터 숫자 가능
	void speedUp() {
		System.out.println(speed+"속도 향상");
	}
	void speedDown() {
		System.out.println(speed+"속도 저하");
	}
	
	
	void print() {
		System.out.println("색깔 : "+color);
		System.out.println("속도 : "+speed);
	}
	
	
}
