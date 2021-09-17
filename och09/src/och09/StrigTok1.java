package och09;

import java.util.StringTokenizer;

public class StrigTok1 {

	public static void main(String[] args) {
		//										원소									구분자
		StringTokenizer st = new StringTokenizer("산딸기, 집딸기, 판딸기.집딸기, 알칼리딸기", ".,");
		// . : , : 하나의 원소 구분
		// st --> 산딸기, 집딸기, 판딸기.집딸기, 알칼리딸기
		while(st.hasMoreElements()) {//hasMoreElements : 원소를 가지고 있으면 : boolean 참 거짓:
			System.out.println(st.nextElement());	//nextElement :  다음 원소를 가지고 와라
		}

	}

}
