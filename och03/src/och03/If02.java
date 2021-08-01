package och03;

public class If02 {

	public static void main(String[] args) {
		// args -> main의 parameter, parsing Integer.parseInt(문자를 숫자로 전환)
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if ( a> 0 ) {
			System.out.println(a+"는 양수");
			System.out.println("월요일");
		} else {
			System.out.println(a+"는 음수");
			System.out.println("29일");
		}
		System.out.println("b->"+b);  	
		System.out.println("프로그램 종료");  	
	}

}
