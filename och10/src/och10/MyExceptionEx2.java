package och10;

public class MyExceptionEx2 {

	public static void main(String[] args) {

		try {
			int kkk = Integer.parseInt(args[0]);	//급여
			//하한 급여
			if(kkk<100)	throw new MyException1();
			//상한 급여
			if(kkk>1000) throw new MyException2();
			System.out.println("정상 실행");
		}
		catch(ArrayIndexOutOfBoundsException e) {// 인덱스 범위를 초과하여 사용하는 거
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java MyExceptionEx2 num1");
		}
		catch(MyException1 e) {
			System.out.println("하한 급여 -> "+e.getMessage());
		}
		catch(MyException2 e) {
			System.out.println("상한 급여 -> "+e.getMessage());
		}
		
		
	}

}
