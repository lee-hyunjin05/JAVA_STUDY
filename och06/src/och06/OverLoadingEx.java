package och06;


//method overloading
// ***** 오버로딩 : 이름이 같은 함수 이면서, 매개변수의 수나 타입이 다를때
class OverLoad{
	void print() {
		System.out.println("매개변수 없다");
	}
	void print(int x) {
		System.out.println("매개변수 1개 int = "+x);
	}
	void print(String str) {
		System.out.println("매개변수 1개 str [" +str+"]");
	}
	void print(String str, int y) {
		System.out.println("매개변수 2개 str [" + str +"] , int = "+y);
	}
}


public class OverLoadingEx {

	public static void main(String[] args) {
		OverLoad ol = new OverLoad();
		ol.print();
		ol.print(12);
		ol.print("대박");
		ol.print("수요일", 16);
		
	}
	
}
