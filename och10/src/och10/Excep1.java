package och10;

public class Excep1 {

	public static void main(String[] args) {
		int num = 100, result = 0;
		int randomInt = 0;//0으로 나누어 줄 수 있으니 산술적 에러 ㄱ
		
		for(int i = 0; i < 10 ; i++) {
			randomInt = (int) (Math.random()*10);
			System.out.println("randomInt : "+randomInt);
			
			result = num/randomInt;
			System.out.println("나눗셈 결과 : "+result);
		}
	}

}
