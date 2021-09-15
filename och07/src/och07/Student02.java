package och07;

public class Student02 extends Person02{
	
	private String sno;
	Student02(String name, int age, String sno){
		super(name, age);
		this.sno = sno;
	}
	public void print() {
		super.print();
		System.out.println("학번 : "+sno);
	}
	
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	
}

class Teacher02 extends Person02{
	
	private String subject;
	Teacher02(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}
	public void print() {
		super.print();
		System.out.println("과목 : "+subject);
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}

class Manager02 extends Person02{
	
	private String part;
	Manager02(String name, int age, String part){
		super(name, age);
		this.part = part;
	}
	public void print() {
		super.print();
		System.out.println("담당 : "+part);
	}
	
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
}



