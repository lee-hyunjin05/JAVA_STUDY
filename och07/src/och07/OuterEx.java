package och07;

public class OuterEx {

	public static void main(String[] args) {
		
		Outer ou1 = new Outer(100,100);
		Outer.Inner in1 = ou1.getInstance(); //getInner메소드 안에 new  어쩌구 있음
		System.out.println("부피 : "+in1.volume());
		
		Outer ou2 = new Outer(200,100);
		Outer.Inner in2 = ou2.new Inner();
		//이너 클라스
		System.out.println("부피 : "+in2.volume());
		
	}

}
