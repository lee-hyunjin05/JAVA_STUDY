package och11;

import java.util.ArrayList;

public class CarEx {

	public static void main(String[] args) {

		ArrayList<Car> al = new ArrayList<>();
		
		al.add(new Car());
		al.add(new Bus());
		al.add(new Taxi());
		
		for(Car c : al) {
			c.print();
			if(c instanceof Bus) {
				((Bus)c).move();
					//아래 두 줄이 위 한줄 같으
					// Bus b = (Bus)c;
					//	b.move();
			}
		}
		
	}

}
