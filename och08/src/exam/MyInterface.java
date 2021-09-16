package exam;

public interface MyInterface {

	public void method1();
	public default void method2() {
		System.out.println("자바 8부터 인터페이스도 디폴트 메소드에 한에서 구현 가능");
	}
	
	
}
