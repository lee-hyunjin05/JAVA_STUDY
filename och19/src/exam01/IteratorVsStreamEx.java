package exam01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamEx {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("홍길동","신응권","김자바");
		
		//Iterator 이용
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println("-----------Stream------------");
		
		//Stream 이동
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}

}
