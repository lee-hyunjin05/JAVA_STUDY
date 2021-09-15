package och07;

//부모 rv1 = new 자식(); up casting OK
//부모 method()와 자식 method() 이름을 같을 때는  자식 메소드 실행
//부모의 멤버변수와 자식의 멤버변수가 이름이  같을 때는 부모 멤버변수 실행
//
//자식 rv2 = new 부모(); down casting X
//자식 rv3 = (자식)부모객체;  down casting
//강제 형변환 하면 
//1) 문법적 에러가 없음 
//2) 에러가 있을 때도 없을 때도 있다

public class Person02Ex {

	public static void main(String[] args) {
		
		Person02[] ps = new Person02[5];
		ps[0] = new Student02("옥주현", 23, "1203667");
		ps[1] = new Student02("김유신", 53, "1386889");
		ps[2] = new Teacher02("대조영", 48, "Java");
		ps[3] = new Manager02("김소현", 28, "청소");
		ps[4] = new Manager02("전현무", 40, "영업");
		
		for( Person02 p : ps) {
			p.print();
			if(p instanceof Manager02) {
				System.out.println("2번째 방법 : "+ ((Manager02) p).getPart());
			}
		}
	}

}
