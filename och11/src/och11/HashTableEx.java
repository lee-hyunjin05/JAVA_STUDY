package och11;

import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {

		Hashtable<String, String> hm = new Hashtable<>();
		hm.put("이승우", "010 - 2222 - 3333");
		hm.put("손흥민", "010 - 3333 - 3333");
		hm.put("전지현", "010 - 4455 - 3333");
										
		System.out.println("이승우 TEL : "+hm.get("이승우"));
		System.out.println("손흥민 TEL : "+hm.get("손흥민"));
		System.out.println("전지현 TEL : "+hm.get("전지현"));
		
		//
	}

}
