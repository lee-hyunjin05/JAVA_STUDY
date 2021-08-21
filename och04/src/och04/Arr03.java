package och04;

public class Arr03 {

	public static void main(String[] args) {
		//                0        1       2       3
		String[] str = { "산토끼", "고양이", "진도개", "치와와" };
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("=====  확장 kk  =========");
		for (String kk : str) {
			System.out.println(kk);
		}
	}

}
