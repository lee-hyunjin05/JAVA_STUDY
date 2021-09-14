package och06;

import java.util.Scanner;


class Factorial {
	int result = 1;
	//재귀함수 (recursive) - 나를 다시 부르는거
	void factorial(int cnt) {
		if( cnt>1 ) {
			result *= cnt;
			System.out.printf( cnt + " * ");
			factorial(--cnt);
		}
		else {
			System.out.println( cnt );
			System.out.println("Factoial의 결과는 : "+result);
			return;
		}
	}
}
	
public class FectorialEx {
	
	public static void main(String[] args) { //static void main : 내가 나를 인스턴트화 나 자신을 불러서 호출하기 위함
	 
		Factorial e = new Factorial();
		System.out.println("Factorial 10이하의 숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in); //system.in : 키보드로입력
		int InNum = sc.nextInt();	//nextInt : 입력하고 엔터키를 치면 인터져로 가져와서 쓰인단는 것
		e.factorial(InNum);
	
	}

}


