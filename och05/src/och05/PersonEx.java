package och05;

class Person{

	String name;
	int age;
	String gender;
	
	void print() {
		System.out.println("이름 : "+name+"\t 나이 : "+age+"\t 성별 : "+gender);
	}

	//default 생성자 기본 생성자 : 생성자가 있으면 기본생성자 안만드렁줌
	Person(){
		
	}
	Person( String nm, int a, String gen){
		name = nm;
		age = a;
		gender = gen;
	}
}

public class PersonEx {

	public static void main(String[] args) {
		Person per11 = new Person("홍길동", 52, "M");
		Person per12 = new Person();
		Person per13 = new Person();
		
//		per11.name = "홍 길동";	per11.age = 52;	per11.gender = "M";
		per12.name = "연개소문";	per12.age = 62;	per12.gender = "M";
		per13.name = "선덕여왕";	per13.age = 72;	per13.gender = "F";
		
		per11.print();
		per12.print();
		per13.print();
	}

}
