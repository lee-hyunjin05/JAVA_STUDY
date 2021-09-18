package och10;

import java.util.Scanner;

public class Excep3 {

	public static void main(String[] args) {

		int result = 0;
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.println("첫번째 숫자 입력하세요");
				//		숫자형으로 변환		문자열을 입력 받아서
				num1 = Integer.parseInt(sc.nextLine());
				
				if(num1 == 0) break;
				
				System.out.println("두번째 숫자 입력하세요.");
				num2 = Integer.parseInt(sc.nextLine());
				
				result = num1/num2;
				System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);	
			}
			catch(ArithmeticException e) {//산술적 에러
										//민감한 프로그램은 하나하나 관련된 입셉션을 넣어 주는게 좋음
										//런타임, 배열 철자 오류 등등
				System.out.println("숫자만 가능 합니다.");
			}
			catch(Exception e) {//내가 예측 가능 한 에러보다 모르는 에러가 많으니까 걍 다 잡을수 있는 개쏀 친구를 써주는 에러무시들의 조상님
				System.out.println("나머지 에러"+e.getMessage());
				break;
			}
			finally {
				System.out.println("난 무조건 나온다.");
			}
		}
		while(true);
		
		System.out.println("프로그램 종료");
		sc.close();
		
	}

}
