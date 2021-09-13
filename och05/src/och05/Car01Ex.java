package och05;

class Car1{
	//class안에 선언되어 있는 변수 : instance 변수
	String color ;	// Member 변수 , 필드
	
	// static 으로 선언한 모든 instance들이 공유된다.
	static int speed;	// *** class 공용 변수 //독립된 클래스
		
	void print() {
		
		//int kkk = 123; // local 변수
		System.out.println("색깔 : "+color);
		System.out.println("속도 : "+speed);
		for(int i=0; i<50; i++) {
			System.out.printf("=");
		}
		System.out.println();
	}
}

// public :: 클래스 파일명이 자바클래스 파일명과 동일한 것만 시행할 수 있다.
public class Car01Ex {

	public static void main(String[] args) {
		//but!! 
		//speed를 따로 선언하지 않으면 얘로 모두 공유됨
		Car1.speed = 50; //스테틱은 선언 안하고 사용 가능

		
		
		
//		선언			생성
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		
		c1.color = "빨강";
		c1.speed =200;
		c2.color = "노랑";
//		속도 값 안줌, int 디폴드 값 = 0;
		
		c1.print();
		c2.print();
		
		//System.out.printf(kkk+"kkk");//오류남
		
	}

}
