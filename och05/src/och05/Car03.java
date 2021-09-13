package och05;

public class Car03 {

	String name;	//차 이름
	int inTime;		//입고시간
	int outTime;	//출고시간
	int fee;		//주차요금
	// 상수 : 변하지 않는 수 : 선언 소문자로 해도 되지만, 대문자로 하는게 묵시적 약속
	final int ANTPERTIME = 3000;	//시간 당 요금
	
	
//*	생성자, Constructor 
// : 인스턴스 변수의 초기화 또는 인스턴스 생성시 수행할 작업에 사용
// 모든 클래스에는 하나의 생성자가 있어야 한다. 
// 생성자가 없으면 시스템 내부에서 알아서 생성됨(기본생성자 디폴트값, null,0)
	Car03(String n, int in, int out){
		name	= n;
		inTime	= in;
		outTime = out;
	}
	
	void print() {
		int fee = (outTime - inTime)*ANTPERTIME;
		System.out.println("차 이름 : "+name);
		System.out.println("입고시간 : "+inTime);
		System.out.println("출고시간 : "+outTime);
		System.out.println("주차요금 : "+fee);
		for(int i = 0; i<50; i++) {
			System.out.printf("=");
		}
		System.out.println();
		
	}
		
	
}
