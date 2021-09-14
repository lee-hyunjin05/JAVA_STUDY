package och06;

class Car02{
	String name;
	String color;
	int speed;
	
	
//	Car02(){
//	} 기본 생성자 자동 생성 되는데, 생성자 만들어 주면 기본생성자 만들어 ㅜ저ㅑㅇ 실행
	
	//생성자
	Car02(String name02, String color, int speed){
		name = name02; //이거 되긴 하지만 넘무 헷갈
		this.color = color;
		this.speed = speed;
		//지역변수와 맴버변수의 이름이 같을 때, 혼란 반드시 이름이 같을때는 this참조!
	}
	//	this 인스턴스 : 자신을 가르키는 참조변수, 인스턴스의 주소가 저장되어 있음
	// 모든 인스턴스 매서드에 지역변수로 숨겨진 채로 존재
	// 인스턴스 변수와 지역변수를 구분하기 위해 참조변수 this사용
		
	void print() {
		System.out.println("이름 : "+name+"\t색깔 : "+color+"\t속도 : "+speed);
	}
}

public class Car02Ex {
	
	public static void main(String[] args) {
		
		Car02 c1 =  new Car02("소나타","빨강",150);
		Car02 c2 =  new Car02("카니발","검정",120);
		//Car02 c3 =  new Car02();
		c1.print();
		c2.print();		
		//c3.print();
	}
}
