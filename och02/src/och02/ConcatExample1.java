package och02;

public class ConcatExample1 {

	public static void main(String[] args) {
		   // 문자열 시작 모두 문자열 인식 
	       String str1 = "num=" + 3 + 4;
	       // 숫자 시작 --> 연산후 문자 결합시 문자열 인식 
	       String str2 = 3 + 4 + "=num";
	       System.out.println(str1);
	       System.out.println(str2);	
	       }

}
