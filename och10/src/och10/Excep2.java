package och10;

public class Excep2 {

	public static void main(String[] args) {
		int num = 100, result = 0;
		int randomInt = 0;
		
		for(int i = 0; i < 10 ; i++) {
			randomInt = (int) (Math.random()*10);
			System.out.println("randomInt : "+randomInt);
			try {
				result = num/randomInt;
				System.out.println("나눗셈 결과 : "+result);
			}
			catch (ArithmeticException e){//산술적 ㅇㅔ러 무시
				
				System.out.println("0으로 나눌 수 없습니다.");
				
				
			}
		}
	}

}
