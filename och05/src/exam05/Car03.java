package exam05;

public class Car03 {
	
	//필드
	String company = "현대자동차";
	String model;	//자가용(car2)
	String color;	
	int maxSpeed;
	
	
	//생성자 오버로딩
	Car03(){//기본 생성자
		
	}
		
	Car03(String model){
		//this : 현재 나의 member변수
		this.model = model;
	}
	
	Car03(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car03(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

	
	
}
