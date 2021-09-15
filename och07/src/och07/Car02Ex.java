package och07;

public class Car02Ex {

	public static void main(String[] args) {
		
		//선언은 부모로 선언 //안에 인스턴스화는 자식의 값을 불러넣은것
		Car02[] car = new Car02[3];
		car[0] = new Bus();
		car[1] = new Ambulance();
		car[2] = new FireEngine();
		
		//			bus, ambulance, FireEngine
		//Car02 c = new Bus....
		for(Car02 c : car) {
			c.move();//실행은 부모와 같은 이름의 자식 메소드가 실행 (자식메소드 실행)
			System.out.println("for Car02 --> " +c.a);	// 멤버변수는 부모것만 적용
			
			
			//c.special(); : ambulance에만있어서 오류 남 : car에 공통된 요소들만 수행
			// instanceof --> 객체 타입 변수 **
			// 객체의 타입을 비교할 때는 == x, instanceof
			if( c instanceof Ambulance) {
				Ambulance am = (Ambulance) c;
				// 객체타입변환 : car type 을 ambulance 타입으로 바꿔줌 
				am.special();
				System.out.println("for Car02 --> "+ am.a);
				//기본적으로 부모의 멤버변수만 적용되지만,
				// 캐스팅 이후 멤버변수 선언시 고유객체의 변수 값 사용 가능.
			}
			else if(c instanceof FireEngine) {
				FireEngine fe = (FireEngine) c;
				System.out.println("for Car02 --> "+fe.a);
			}
			
		}
	}

}
