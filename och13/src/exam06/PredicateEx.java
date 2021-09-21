package exam06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

	private static List<Student> list = Arrays.asList(
			new Student("홍길동", "남자", 90),
			new Student("김순희", "여자", 94),
			new Student("김자바", "남자", 95),
			new Student("박한나", "여자", 92)
			);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		//new Student("홍길동", "남자", 90),new Student("김순희", "여자", 94),new Student("김자바", "남자", 95),new Student("박한나", "여자", 92)
		
		for(Student student : list) {
			System.out.println("1.student.getName() : "+student.getName());
			//predicate : 조건을 확인해서 참이면 수행 하는거
			if(predicate.test(student)) { //t.getSex().equals("남자") 남자면 걸리고 여자면 떨어짐
				
				System.out.println("2.student.getName() : "+student.getName());
				count++;
				sum += student.getScore();
				System.out.println("3.student.getScore() : "+student.getScore());
			}
		}
		return(double) sum/count;
	}
	
	
	public static void main(String[] args) {
		
		double maleAvg = avg( t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수 : " +maleAvg);
		
		double femaleAvg = avg( t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수 : " +femaleAvg);
		
	}

}
