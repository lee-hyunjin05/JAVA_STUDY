package och06;

public class SingleTonEx {

	public static void main(String[] args) {
		
		SingleTon st1 = SingleTon.getInstance();
		SingleTon st2 = SingleTon.getInstance();
		st1.str = "넌 누구";
		System.out.println("st1 -> " + st1.str);
		System.out.println("st2 -> " + st2.str);
		if(st1==st2) System.out.println("같다");
		else System.out.println("다르다.");
	}

}
