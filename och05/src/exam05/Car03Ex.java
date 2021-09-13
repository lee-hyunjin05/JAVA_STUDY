package exam05;

public class Car03Ex {

	public static void main(String[] args) {
	
		System.out.println();
		System.out.println("===============car1=====================");
		System.out.println();
		Car03 car1 = new Car03();
		System.out.println("car1.company : "+car1.company);
		
		System.out.println();
		System.out.println("===============car2=====================");
		System.out.println();
		
		Car03 car2 = new Car03("자가용");
		System.out.println("car2.company : "+ car2.company);
		System.out.println("car2.model : "+ car2.model);
		
		System.out.println();
		System.out.println("===============car3=====================");
		System.out.println();
		
		
		Car03 car3 = new Car03("자가용", "빨강");
		System.out.println("car3.company : "+ car3.company);
		System.out.println("car3.model : "+ car3.model);
		System.out.println("car3.color : "+ car3.color);
		
		System.out.println();
		System.out.println("===============car4=====================");
		System.out.println();
		
		
		Car03 car4 = new Car03("택시", "검정", 200);
		car4.company = "중앙정보";
		System.out.println("car4.company : "+ car4.company);
		System.out.println("car4.model : "+ car4.model);
		System.out.println("car4.color : "+ car4.color);
		System.out.println("car4.maxSpeed : "+ car4.maxSpeed);
		
	}
}
