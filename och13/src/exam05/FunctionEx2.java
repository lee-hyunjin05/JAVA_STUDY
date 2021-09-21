package exam05;

import java.util.List;
import java.util.function.ToIntFunction;
import java.util.Arrays;

public class FunctionEx2 {
	private static List<Student> List = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
		);
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : List) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / List.size();
		System.out.println("합계점수: " + sum);
		return avg;
	}

	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);

	}

}
