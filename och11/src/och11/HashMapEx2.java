package och11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("이승우", "010 - 2222 - 3333");
		hm.put("손흥민", "010 - 3333 - 3333");
		hm.put("전지현", "010 - 4455 - 3333");
										//		key값을 주면 get -value값을 던져준다.
		System.out.println("이승우 TEL : "+hm.get("이승우"));
		System.out.println("손흥민 TEL : "+hm.get("손흥민"));
		System.out.println("전지현 TEL : "+hm.get("전지현"));
		
		//순서 유지 x, 키 중복 x, 값 중복 허용
		
		//set으로 키값보는 디자인패턴
		Set<String> st = hm.keySet();//hm에서 키값만 가지고 오는거
		for(String str : st) {//키값 st에 저장하고
			System.out.println(str+"의 전화 [Set] -->"+hm.get(str));
		}
		
		//iterator로 키값보는 디자인패턴
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + "의 전화 "+hm.get(key));
		}
	}

}
