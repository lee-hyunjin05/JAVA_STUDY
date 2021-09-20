package och12;

class G1 extends Thread{
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}

class G2 implements Runnable{
	@Override
	public void run() {

		for(int i=0; i<20; i++) {
			System.out.print("+");
		}
		System.out.println();
	}
	
}

class G3 implements Runnable{
	@Override
	public void run() {

		for(int i=0; i<20; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		
		G1 th1 = new G1();
		G2 r2 = new G2();
		G3 r3 = new G3();
		
		Thread th2 = new Thread(r2);
		Thread th3 = new Thread(r3); //런에에ㅣ블은 다시 스레드로 감싸야 하고
		
		th1.start();				//상속이는 걍 함
		th2.start();
		th3.start();
	}

}
