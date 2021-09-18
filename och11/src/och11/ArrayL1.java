package och11;

import java.util.ArrayList;

public class ArrayL1 {

	public static void main(String[] args) {
		//			< > 안에 뭐든 넣을 수 이ㅣㅆ음
		ArrayList<String> al = new ArrayList<>();
		al.add("구렁2");//[0]
		al.add("펄렁이");//[1]..
		al.add("구렁2");
		al.add("구렁4");
		al.add("구렁3");
		for(int i = 0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("------------------------");
		for(String str : al) {
			System.out.println(str);
		}
	}

}
