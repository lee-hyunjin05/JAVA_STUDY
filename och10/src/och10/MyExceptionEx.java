package och10;

public class MyExceptionEx {

	public static void main(String[] args) {
		//나만의 예외 클래스 한번 만들어 본거 사용한거
		int kkk = 15;
		try {
			if(kkk>10) throw new MyException();
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
