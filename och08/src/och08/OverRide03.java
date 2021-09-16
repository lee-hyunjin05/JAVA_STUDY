package och08;

abstract class C1{ //추상클라스
	
	int k;
	public C1() {
		System.out.println("추상 class 생성자");
	}
	void setk(int k) {
		this.k = k;
	}
	abstract void print();	//하나의 추상 메소드가 존재해야 함

}

class C2 extends C1{ //추상 클래스를 상속받는 경우 
					 // 반드시 추상 매소드를 오버라이딩 해야함
					 //	안하면 오류뜸

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("C2 k = "+k);
	}
	
}



public class OverRide03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c1 = new C2();
		c1.setk(12);
		c1.print();
		C2 c2 = new C2();
		c2.setk(7);
		c2.print();	//c2.k와 c1.k --> 각각의 값은 다름
		c1.print();
	}

}
