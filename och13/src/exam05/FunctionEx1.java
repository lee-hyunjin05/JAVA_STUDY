package exam05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx1 {

	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
		);
	//					매개값,리턴값 모두 있음 function :  람다식을 실행할 준비가 된거래	
	//										Student를 String으로 매핑
	//순서 3. --> printString 매소드 진입 시작
	public static void printString(Function<Student,String> function) {
			
			int i=0;
			// Student("홍길동", 90, 96),Student("신용권", 95, 93)
			for(Student student : list) {
				System.out.println("i -> "+(++i));
				//				apply 하는 순간 람다식 적용
				// 순서 4.
				System.out.print(function.apply(student)+" 2.");
			}
			System.out.println();
		}

	public static void printInt(ToIntFunction<Student> function) {
			// Student("홍길동", 90, 96),Student("신용권", 95, 93)
			for(Student student : list) {
				System.out.print(function.applyAsInt(student)+" ");
			}
			System.out.println();
		}
			
	public static void main(String[] args) {
		// 순서 1
		System.out.println("[1. 학생이름]");
		// 순서 2		--> printString 매소드 진입
		// 			순서 5 --> {t->t.getname()}
		printString(t -> t.getName());
		
		System.out.println("[영어점수]");
		printInt(t -> t.getEnglishScore());
		
		System.out.println("[수학점수]");
		printInt(t -> t.getMathScore());
				
	}

}
