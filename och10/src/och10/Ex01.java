package och10;

public class Ex01 {
	
	static void method(boolean b) {
		try {
			System.out.println(1 + "b-->" + b);
			if(b) {
				throw new ArithmeticException();//0으로 나누기 등 산술적인 예외
				}//true
			System.out.println(2);//false
			// if (boolean)문 참일 경우만 실행
		//예외가 발생면 실행하지 않는 문장
		}
		catch(RuntimeException r){ // true)) ArithmeticException 이 없어서 부모인 RuntimeException에 걸림
			System.out.println("RuntimeException" + "-->" +3);
			return;
		//메서드를 빠져 나간다. (finally 블럭을 수행한 후에)
		}
		catch(Exception e) {//생각지도 못하는 에러가 걸릴지 모르니 무조건 해주는게 좋다. 
			System.out.println(4);
			return;
		}
		finally {	//수문장 <('^')>
			//예외발생여부에 관계없이 항상 실행되는 문장
			System.out.println("예외발생여부에 관계없이 항상 실행되는 문장"+5);
		}
		System.out.println("정상적으로 끝나야 실행되는 문장");
	}
	

	public static void main(String[] args) {
		
		method(true);//예외발생
		method(false);//예외안발생

	}

}
