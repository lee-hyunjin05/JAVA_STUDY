package och05;


	
class Score {
	int		kor = 70;
	static int	eng = 80;	//공유
	int 	math = 90;
	
	void total() {
		System.out.printf("kor : "+kor+"\t"+"eng : "+eng+"\t"+"math : "+math +"\t");
		System.out.printf("총 점 : "+(kor+eng+math));
		System.out.println("\t 평 균 : "+(kor+eng+math)/3);
	}
}

public class ScoreEx {
	
	public static void main(String[] args) {
		Score.eng = 94;
		Score s1 = new Score(); //기본생성자로
		Score s2 = new Score();	//대입해준거
		Score s3 = new Score();	//대입+기본
		
		s2.kor	 =90;
		s2.eng	 =99; //스테틱 변수는 모두 공유하는 거라 지정해준 변수는 맨 마지막에 할당한 수로 공유된다.
		s2.math	 =97;
		
		s3.kor	 =88;
		s3.math	 =66;
		
		s1.total();
		s2.total();
		s3.total();
	}

}
