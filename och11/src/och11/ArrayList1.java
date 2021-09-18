package och11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> list =  new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나");
		
		System.out.println("요소의 개수 -> "+ list.size());
		
		System.out.println(">> Iterator 객체로 요소 얻기 <<");
		// 나열형 --> 사과	바나나	귤	오렌지	바나나	
		Iterator elements = list.iterator();//iterator : 원소를 나열형으로 가지공 ㅣㅆ음/많ㄹ이 쓰임/디자인 패턴
		while(elements.hasNext()) //요소가 있다면 
			System.out.printf(elements.next()+"\t"); //요소를 얻어내어 출력
		System.out.println("\n");
	
		System.out.println(">> get 메소드로 요소 얻기 <<");
		for(int i = 0 ;i<list.size();i++) {
			System.out.printf(list.get(i)+"\t");
		}
		System.out.println();

	}

}
