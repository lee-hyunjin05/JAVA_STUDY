package och10;

public class Throws3 {//throws는 나룰 호출한 놈한테 던짐
	//static 인스턴스화 필요 x
	static void method1() throws Exception{//7 : 얘가 6불러준건데 얘도 없으니까 날 불러준 곳으로 또 감
		System.out.println("1. 예외처리 method1");//2
		method2();//3
	}
	static void method2() throws Exception{//6 얘가 5불렀음 근데 처리할 게 ㅇ벗으니까 다시 날 불러준 곳으로
		System.out.println("2. 예외처리 method2");//4
		throw new Exception("3. method2 error 발생...");//5 : throw : 나를 불러준 데로 가는거
	}
	
	public static void main(String[] args) {//8 얘가 부른거 try, catch문 있으니까
		
		try {
			method1();//1 
		}
		catch(Exception e) {//9 그래서 이거 실행		+ getmessge : 5번 데리고 같이 ㅇㅋㅇㅋ
			System.out.println("4. main 예외처리 " + e.getMessage());
		}
		
	}//순서??
}
