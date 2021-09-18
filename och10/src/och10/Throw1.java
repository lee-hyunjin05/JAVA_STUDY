package och10;

public class Throw1 {

	public static void main(String[] args) {

		System.out.println("안녕");
		Exception e1 = new Exception("내가 에러 만들었다~~^~^~~~");//2
		//getmess~~~ : 지정된 메세지 대신 만드렁준 메세지를 불러주게 위에 만들ㄷ믐ㅇㄴㅇㄴ
		
		try {//1
			throw e1; //throw는ㄴ 메소드 안에서 / 정해진 곳에 던지고
						//throws는 메소드 밖에서	/날 부른애 한테 던짐
		}
		catch(Exception e2){
			System.out.println(e2.getMessage()+"kkk");//3
		}
		
		System.out.println("프로그램이 정상 종료되었음");//4
	}

}
