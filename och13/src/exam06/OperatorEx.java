package exam06;

import java.util.function.IntBinaryOperator;

public class OperatorEx {
	private static int[] scores = {92, 95, 87};
	// IntBinaryOperator
	//                  2.
	public static int maxOrMin(IntBinaryOperator operator) { // int값으로 계산을 하겠다?  
		int result = scores[0];
		//             92, 95, 87
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}


	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin(
				(a, b) -> {
					if(a>=b) return a;
					else return b;
				}
				);
		System.out.println("최대값: " + max);
		
		//최소값 얻기  1.
		int min = maxOrMin(
				(a, b) -> {
					if(a<=b) return a;
					else return b;
				}
			);
		System.out.println("최소값: " + min);
	}
}
