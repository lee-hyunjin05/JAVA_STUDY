package och05;

public class CarEx {

	public static void main(String[] args) {

		//선언 		생성
		Car myCar = new Car();
		
		myCar.color = "파랑";
		myCar.speed = 200;
		myCar.speedUp();
		myCar.speedDown();
		myCar.print();

		for(int i=0; i<50; i++) {
			System.out.printf("=");
		}
		System.out.println();
		
		Car yourCar	= new Car();
		
		yourCar.color = "빨강";
		yourCar.speed = 120;
		yourCar.speedUp();
		yourCar.speedDown();
		yourCar.print();
		
	}

}
