package och11;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		
		//		key		value		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("이승우", "010 - 2222 - 3333");
		hm.put("손흥민", "010 - 3333 - 3333");
		hm.put("전지현", "010 - 4455 - 3333");
		hm.put("손흥민", "010 - 3456 - 7890");
		hm.put("손흥민2", "010 - 3456 - 7890");
										//		key값을 주면 get -value값을 던져준다.
		System.out.println("이승우 TEL : "+hm.get("이승우"));
		System.out.println("손흥민 TEL : "+hm.get("손흥민"));
		System.out.println("전지현 TEL : "+hm.get("전지현"));
		System.out.println("손흥민2 TEL : "+hm.get("손흥민2"));
		//순서 유지 x, 키 중복 x, 값 중복 허용
	}

}
