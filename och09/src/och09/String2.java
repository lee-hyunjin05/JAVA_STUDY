package och09;

public class String2 {

	public static void main(String[] args) {

		char[] c = {'k', 'o', 'r', 'e', 'a'};
		String str1 = new String(c);
		String str2 = new String("\sfighting");
		String str3 = str1 + str2;
//		String str4 = new String("bbb");
//		String str5 = "bbb";
//		String str6 = "bbb";
		
		System.out.println(str3);
		System.out.println(2+1+1+5+"년");		// 숫자가 먼저 오면 연산하고 문자 붙음
		System.out.println("연1 : "+2+1+1+5);	//문자가 먼저 오면 문자열로 인식해서 연산을 안함 스트링화됨
		System.out.println("연2 : "+(2+1+1+5));	//문자를 먼저 쓰고 싶으면, 숫자는 소괄호 해줘야 따로 연산해줌
	}

}
