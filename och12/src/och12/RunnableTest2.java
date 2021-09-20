package och12;

class Ra3 implements Runnable{
	@Override
	public void run() {

		for(int i=1; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+"대박"+i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}

class Ra4 implements Runnable{
	@Override
	public void run() {

		for(int i=1; i<=20; i++) {
			System.out.println(Thread.currentThread().getName()+"월요일"+i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}


public class RunnableTest2 {

	public static void main(String[] args) {

		Ra3 ra1 = new Ra3();
		Ra4 ra2 = new Ra4();
		
		Thread th1 = new Thread(ra1,"ㅋㅋ");
		Thread th2 = new Thread(ra2,"ㅠㅠ");
		
		th1.start();
		th2.start();
		
	}

}
