package och11;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<String> kk = new LinkedList<String>();
		String [] animal = {"산토끼", "고양이", "진돗개","치와와", "토끼"};
		for(int i = 0; i<animal.length; i++) {
			kk.add(animal[i]);
		}
		int i = 0;
		Iterator<String> it = kk.iterator();//나열형으로 전환
		while(it.hasNext()) {//hasnext : 가지고이쓰면
			System.out.println( i +"->"+it.next());	//ㅏ가져와라
			i++;
		}
		System.out.println("kk.iterator.size ->"+kk.size());
		
	}

}
