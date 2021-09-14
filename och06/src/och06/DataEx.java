package och06;


class Data {
	int kor;
	int eng;
	int math;
	
	//call by reference //주소값 참조
	void addRef(Data d1, Data d2){
		d1.kor = d2.eng;
		System.out.println("addRef method kor 점수 : "+ d1.kor);
		System.out.println("addRef method eng 점수 : "+ d1.eng);
	}
	
	//call by value
	void addVal(int kor, int eng) {
		eng = kor;
		//this.eng = eng;
		System.out.println("addVal method eng 점수 : "+ eng);
		System.out.println("addVal Method kor 점수 : "+ kor);
	}
	
}
public class DataEx {

	public static void main(String[] args) {
		// 확보 공간의 주소를 가지고 있다.
		Data d1 = new Data();
		
		 //call by value	
		//primitive 값을 전달
		//int, long, double...
		//자료를 넘겨주고 끝, 따로 값이 바뀌는것은 x
		d1.addVal(50, 70);
		
		d1.kor = 50;	//d1.kor = 70;
		
		System.out.println("d1 addVal Method kor 점수 : "+ d1.kor);
		System.out.println("d1 addVal Method Eng 점수 : "+ d1.eng);
		

//		Data d2 = new Data();
//		Data d3 = new Data();
//		
//		//call by reference
//		//객체를 넘겨 줄때
//		
//		d1.kor = 50;	//d1.kor = 70;
//		d1.math = 70;	//d1.kor = 70;
//		d2.eng = 80;
//		d3.addRef(d1, d2);	//instance를 넘겨주면 주소값을 넘겨주는 효과
//		System.out.println("main 국어 점수 : "+d1.kor +"\t영어 : "+d1.eng);
//		
	}

}
