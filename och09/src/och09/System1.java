package och09;

public class System1 {

	public static void main(String[] args) {

		//getenv : 주소찾기
		String path = System.getenv("path");
		String java_home = System.getenv("JAVA_HOME");
		System.out.println(path);
		System.out.println(java_home);
		
	}

}
