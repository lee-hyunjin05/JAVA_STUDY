package och08;

//인터페이스는 1) 설계도의 역할을 함 ↑↑↑
//			2) 다중상속을 지원 (극 일부분)
//			3) class와 class를 연결 해준다. (중요)
//			4) 부품화
//				   _________
//			   	  /개배고프다!/
//				  /--------
// 중개역 역할 \('^')/ 
// 보통 기능설명하고 막 그러는 설계도 전달할 때 많이 사용 하는듯..? ㅁㄹ

public interface Inter01 {

	int a = 3;
	void display();
	//void print(){}; 인터페이스는 추상메소드로만 이루어져야 함
	void print();
	
}

//구현 //클래스는 extends, 인터페이스는 implements
class D1 implements Inter01{

	@Override//부모 등에 올라 탄거
	public void display() {
		//a++; final 임 : 값을 변경할 수 있는 상수이먀 스택틱처럼 공용으로 씀. 스태틱의 개념 적용
		System.out.println("재정의 했음 a --> "+a);
		
	}

	@Override
	public void print() {
		System.out.println("재정의 된 print...");
	}
	
}
