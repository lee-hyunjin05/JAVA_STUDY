package exam01;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceEx {

	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList( 
				new Student("홍길동", 10),
				new Student("신용권", 25),
				new Student("유미선", 30)
				);
		double avg = studentList.stream()
				//중간처리(학생 객체를 정수로 매핑)
				.mapToInt(Student :: getScore) ///점수만 뽀ㅃ아서
				//최종 처리(평균 점수)
				.average() //그거에 대한 통계
				.getAsDouble(); //return형을 더블 형으로 돌려줄게
		
//		int avg = (int) studentList.stream()
//				//중간처리(학생 객체를 정수로 매핑)
//				.mapToInt(Student :: getScore) ///점수만 뽀ㅃ아서
//				//최종 처리(평균 점수)
//				.average() //그거에 대한 통계
//				.getAsDouble(); //return형을 더블 형으로 돌려줄게
		//인트형으로 하면 뒷ㅅ 숫자가 짤리니까안댐				
		
		System.out.println("평균 점수 : "+avg);
		
	}

}
