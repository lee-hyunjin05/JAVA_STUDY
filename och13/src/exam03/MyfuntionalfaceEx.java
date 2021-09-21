package exam03;

public class MyfuntionalfaceEx {

	public static int sum(int x, int y) {
		return (x+y);
	}
	
	public static void main(String[] args) {
		
		Myfunctionalface fi;
		
		fi = (x, y) ->{
			int result = x+y;
			return result;
		};//람다 함축해서 보여주는 친구
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) ->{return x+y;};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x+y;
		System.out.println(fi.method(2, 5));
		
		fi = (x,y) -> sum(x,y);
		System.out.println(fi.method(2, 5));
	}
}
