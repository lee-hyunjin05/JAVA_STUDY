package och06;

class Encapsule{
	private String name;
	private int age;

// Encapsule(String name, int age){
//	this.name = name;
//	this.age = age;
//}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("나이입력 오류 ");
		}
		else {
			this.age = age;
		}
	}

}


//***
public class EncapsuleEx {

	public static void main(String[] args) {
	
		Encapsule h1 = new Encapsule();
		
		//정보보호 때문에 에러
//		h1.name = "이현진";
//		h1.age = 25;
//		System.out.println("이름 : "+h1.name);
//		System.out.println("나이 : "+h1.age);
		
		h1.setName("이현진");
		h1.setAge(-10);	
		System.out.println("이름 : "+h1.getName());
		System.out.println("나이 : "+h1.getAge());
		
		
		
	}

}
