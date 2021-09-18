package och11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		//set 은 순서를 유지하지 않고 중복을 허용하지 않는다.
		hs.add("구렁2");
		hs.add("고양이");
		hs.add("야옹이");
		hs.add("구렁2");
		hs.add("진도개");
		hs.add("멍멍이");
		for(String str : hs) {
			System.out.println(str);
		}
		System.out.println("============================");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
