package och07;

class C1{
	C1(){
		System.out.println("매개변수 없는 부모 생성자");
	}
	//2
	C1(String str){
		System.out.println("매개변수 있는 부모 생성자 1 str " +str);
	}
	void cc1() {
		System.out.println("cc1 야호! 금요일이다!");
	}
}

class C2 extends C1{
	C2(){ //본래 목적은 초기화지만, 값을 써줄수도 잇음웅앵
		//1 super로 C1 매개변수 한개짜리 부른 뒤("헐~"이 스트링 한개짜리니까)에 헐~하고
		super("헐~~~~~~~"); //매개변수 1개 짜리 부모생성자 호출
		//3
		System.out.println("매개변수 없는 자식 생성자");
	}
	void cc1() {
		System.out.println("C2 야호! 금요일이다!");
	}
	void cc2() {
		System.out.println("cc2 자식 Method cc2");
	}
}

public class Super02 {

	public static void main(String[] args) {
		
		//4
		C2 c = new C2();//생성해서 주소값을 넘겨주는 생성자 호출하는.//지금까지 다 생성자 호출 해줬었는데,, 디폴드값이라 몰랐던거임
		c.cc2();
		c.cc1();
	}

}
