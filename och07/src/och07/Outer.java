package och07;

public class Outer {

	int width=10;
	int height=10;
	
	Outer (int width, int height){
		this.width = width;
		this.height = height;
	}
	
	//내부 class => inner class //멤버변수 처럼 쓸 수 있는
	class Inner{
	
		int depth = 10;
		public int volume() {
			return width * height * depth;
		}	
	}
	
	public Inner getInstance(){
		return new Inner();
	}	
}
