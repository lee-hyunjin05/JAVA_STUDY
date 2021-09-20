package och12;

//1. interface 상속 받음
class B1 implements Runnable{

	@Override
	public void run() { // 추상메서드 run 구현

		for(int i =0;i<100;i++) {//스레드의 현재 스레드 이름을 가져오ㅏ라↓
			System.out.print(Thread.currentThread().getName() + " :"+i+"대박\t");
								//미래에 받을 이름 자리를 구현해 둔거 나중에 실행ㅇ하면서 첫번쨰 두번쨰 여기 드감
			if(i%5==0) System.out.println();
		}
		
	}
	
}

public class RunTest {

	public static void main(String[] args) {

		//1. interface 상속 받음(implements runnable)
		B1 b1 = new B1();
		B1 b2 = new B1();
		//2. 구현 객체를 new thread(b1, "첫번째")
		Thread th1 = new Thread(b1,"첫번째 "); //여기다 이름을 주어야 함.
		Thread th2 = new Thread(b1,"두번째 ");
		Thread th3 = new Thread(b2,"세번째 "); 
		Thread th4 = new Thread(b2,"네번째 ");
		//3. M.I 적용 / Multiple Interface 적용하기 위해
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}

}
