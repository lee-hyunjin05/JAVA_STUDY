package och07;

public class Car {

	String kind;
	Engine eg;
	// engine 객체를 넣는다는 것은 Engien eg가 인스턴스화 되어 있을 때 가능
	
	//	c.v.b		c.v.r
	Car(String kind, Engine eg){
		this.kind = kind;
		this.eg = eg;
	}
	
	void prit() {
		System.out.println("종류 : "+kind);
		eg.print();
		for(int i=0; i<50; i++) {
			System.out.printf("=");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Engine eg1 = new Engine("알파엔진", 2000);	
		Engine eg2 = new Engine("베타엔진", 3000);
		
		Car[] c = new Car[3];
		c[0] = new Car("소나타",eg1);
		c[1] = new Car("모 닝",eg1);
		c[2] = new Car("벤 츠",eg2);
		
		// c[0]소나타, c[1]모 닝, c[2]벤 츠
		for( Car c1 : c) {
			c1.prit();
		}
	
	}

}
