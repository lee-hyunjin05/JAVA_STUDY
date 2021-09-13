package och05;

public class Calculator {
	//필드
	//생성자
	//메소드
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	//return은 메소드에 하나씩만 해주는 게 좋음 > 혼돈이 있을 수 있기에 돌아각;ㄴ함 개졸려
	double avg(int x, int y) {
		double sum = plus(x, y);
		System.out.println("sum -> "+sum);
		double result = sum/2;
		return result;
	}
	
	void executer() {
		double result = avg(7,10);
		println("평균 실행결과 : "+result);
	}
	
	void println(String message) {
		System.out.println(message);
	}

}
