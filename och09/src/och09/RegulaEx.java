package och09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulaEx {

	public static void main(String[] args) {
		
		String[] data = {"bat", "bavy", "bonus", "cA", "ca"
				, "co","c." ,"c0", "car", "combat", "count", "date", "disc"};
		
		//c로 시작하는 소문자 영단어
		Pattern p = Pattern.compile("c[a-zA-Z0-9]*");
		
		for(int i=0; i<data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches()) {
				System.out.printf(data[i] + ",\s");
			}
		}

	}

}
