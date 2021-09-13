package och05;


	
// ***** OverLoading
//	로딩 창이 여러개 떠있는
// 생성자 위에 있는거면 생성자 오버로딩
class Sonata{
	//기본 생성자(Constructor)
	Sonata(){
		System.out.println("난 기본 " );
	}
	Sonata(int a){
		System.out.println("문의 수는 "+a );
	}
	Sonata(String str){
		System.out.println("옵션 "+str );
	}
	
}
public class ConstrEx01 {

	public static void main(String[] args) {
	
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata(4);
		Sonata s3 = new Sonata("에어백");

	}

}
