package och02;

public class IncDecExample1 {

	public static void main(String[] args) {
	       int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
	       // num++   -> num = num+1
	       int result1 = num1++;           // ++ 연산의 결과는 num1의 기존 값
	       // num2--   -> num2 = num2-1
	       int result2 = num2--;           // -- 연산의 결과는 num2의 기존 값
	       int result3 = ++num3;           // ++ 연산의 결과는 num3의 새로운 값
	       int result4 = --num4;           // -- 연산의 결과는 num4의 새로운 값
	       int result5 ;                   // -- 연산의 결과는 num4의 새로운 값
	       int result6 ;                   // -- 연산의 결과는 num4의 새로운 값
	       
           System.out.println("result1 = " + result1); 
           System.out.println("num1 = "    + num1); 
		   System.out.println("result2 = " + result2);
		   System.out.println("result3 = " + result3);
		   System.out.println("result4 = " + result4);
		   System.out.println("result5 = " + ++result3);
		   result3--;  // result3 = result3-1
		   System.out.println("** result3 = " + result3);
		   System.out.println("result6 = " + result3++);
		   System.out.println("result3 = " + result3);

	}

}
