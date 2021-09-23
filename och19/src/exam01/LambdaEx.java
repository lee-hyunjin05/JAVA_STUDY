package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaEx {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("신용권",92)
				);
		Stream<Student> stream = list.stream();
//		stream.forEach(s -> {
//			String name = s.getName();
//			int score = s.getScore();
//			System.out.println(name + "-"+score);
//		});
		
		//람다 : 한줄코딩
		stream.forEach(s -> {System.out.println(s.getName() + "-"+s.getScore());});


	}

}
