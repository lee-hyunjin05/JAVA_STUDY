package och09;

public class String3 {

	public static void main(String[] args) {

		String str = "10분 남았음";
		System.out.println("str.length()->"+str.length());
		for(int i = 0 ; i< str.length() ; i++) {
			System.out.printf(str.charAt(i)+" ");
		}
		//charAt : 한글자씩 리턴
		System.out.println();
		for(int i = str.length() - 1 ; i>=0 ;i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
