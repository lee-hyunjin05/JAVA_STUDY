package och06;

public class SingleTon {//싱글톤패턴

	String str;
	
	//반드시 프라이빗으로 선언해야 함 : 싱글톤 목적 : 같은 섹션에서 하나만 주어지는것ㅅ
	//				SingleTan type  instance 선언
	private static  SingleTon 		instance;	
	//객체변수도 멤버변수로 선언할 수 있다. == SingleTan instance (= new SingleTan) 선언만 해둠 아직 할당 x
	// 스테틱으로 선언 언제나 사용 가능
	
	// 프라이빗 외부에서 사용 불가 
	private SingleTon() {
		
	}
	//얘는 접근할 수 있어야 하니까 퍼블릭으로 선언해야함
	//			1. SingleTan type 으로 return
	//			2. getInstance --> method명 
	public static SingleTon getInstance() {
	//	1. 처음 사용할 때는 instance == null
		if (instance == null) instance = new SingleTon(); //위에 선언만 했던거 메모리 할당 함
			return instance;		// 메모리 주소 리턴
	} //여러 데이터를 하나의 주소로 불러들임 3r -> reuse
	
	
	
}
