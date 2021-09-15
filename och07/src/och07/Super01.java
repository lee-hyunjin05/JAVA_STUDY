package och07;

class B1 {
	int a =7;
	int b =7;
	void display() {
		System.out.println("B1 대박");
	}
	
	void print() {
		System.out.println("B1 난 부모 print 메소드");
	}
}
//B2 = 자식클래스
class B2 extends B1{
	int a = 10;
	void print() {
		super.print();	//부모 메소드 찾는다.
		System.out.println("B2 부모멤버 a = "+super.a);
		//super라고 선언해주면 부모 선언
		System.out.println("B2 난 자식 메소드 a = "+a); //this가 생략 된 것으로 봄
		System.out.println("B2 난 자식 메소드 b = "+b);
		//자식이 b가 없으면 부모에게서 가져옴
		System.out.println("============================");
		
	}
}

public class Super01 {
	
	public static void main(String[] args) {
		
		B2 b = new B2();
		b.print();
		b.display();
		//자식이 display가 없으니 부모에게서 가져옴
	
	}
}
