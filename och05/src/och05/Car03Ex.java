package och05;

public class Car03Ex {

	public static void main(String[] args) {
		
		Car03 c1 = new Car03("소나타", 10, 14);
		Car03 c2 = new Car03("산타페", 9, 20);
		Car03 c3 = new Car03("모 닝", 12, 13);
		
		//상수는 값을 대입할 수 없다. final은 값이 지정되어 있기에ㅔ
		//c1.ANTPERTIME = 5000;
		
		c1.print();
		c2.print();
		c3.print();
	}

}
