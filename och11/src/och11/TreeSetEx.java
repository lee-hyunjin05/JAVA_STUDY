package och11;

import java.util.TreeSet;

public class TreeSetEx {
     public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		while(ts.size()!=6) {
			int num = (int) (Math.random()*45) + 1;
			System.out.println(num);
			ts.add(num);
		}
		System.out.println(ts);
		
	}//중복 알아서 제거
}
