package exam01;

public class MyfunctionalInterfaceEx {

	public static void main(String[] args) {

		MyfuntionalInterface fi;
		
		fi=()->{
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		
		fi=()->System.out.println("method call3");
		fi.method();
	}

}
