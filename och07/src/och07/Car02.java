package och07;

public class Car02 { //부모클라스

	int a =7;
	void move() {
		System.out.println("차 이동");
	}
}
		//자식클라스
		// extends : 클라스 상속 //확장하다
//자식이 부모 내용을 덮어씀 : override ***** 
//(overloading : 생성자 이름은 같은데 객체의 자료형과 갯수가 다른거)
class Bus extends Car02{ //자식클라스
	int a = 25;
	void move() {	
		System.out.println("40명 태우고 이동");
	}
}
class Ambulance extends Car02{
	int a = 100;
	void move() {
		System.out.println("사이렌 울리며 이동");
	}
	void special() {//확장함)나만의 특별한 메소드
		System.out.println("환자를 태우고 있다.");
	}
}
class FireEngine extends Car02{
	int a = 11;
	void move() {
		System.out.println("물 뿌리면서 이동");
	}
}